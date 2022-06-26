package org.comp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;


@Controller
public class FileController {
    private List<MyFile> files=new ArrayList();
    String nextpath="C:\\Users";

    @GetMapping(value = "/dir")
    public String getPath(Model model) throws IOException {
        File[] directories = new File(nextpath).listFiles();
        files.clear();
        for (File dir:directories){
            BasicFileAttributes basicFileAttributes = Files.readAttributes(dir.toPath(), BasicFileAttributes.class);
            String name=dir.getName();
            String path=dir.getParent();
            Long size =basicFileAttributes.size();
            String dateCreation=basicFileAttributes.creationTime().toString().substring(0,19).replace("T"," ");
            String dateUpdate=basicFileAttributes.lastModifiedTime().toString().substring(0,19).replace("T"," ");
            MyFile myfile=new MyFile(name,path,size,dateCreation,dateUpdate);
            files.add(myfile);
            model.addAttribute("path",path);
        }
        model.addAttribute("files",files);
        return "dir";
    }
    @PostMapping(value = "/dir")
    public String postPath(@RequestParam(value="nextpath",defaultValue = "C:\\Users") String nextpath, HttpServletRequest request, Model model, @ModelAttribute MyFile myfile){
        model.addAttribute("nextpath",nextpath);
        request.setAttribute("nextpath",nextpath);
        System.out.println(myfile.getName());
        return "dir";
    }
}
