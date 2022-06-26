//package application;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class UserController {
//    private List<User> users =new ArrayList<>();
//
//    @GetMapping("/")
//    public String showUsers(Model model){
//        model.addAttribute("users", users);
//        return "index";
//    }
//
//    @PostMapping("/")
//    public String postUsers(@ModelAttribute User user){
//        if(!user.getFname().equals("")
//            && !user.getSname().equals("")
//            && !user.getPname().equals("")){
//            users.add(user);
//        }
//        return "redirect:/";
//    }
//}
