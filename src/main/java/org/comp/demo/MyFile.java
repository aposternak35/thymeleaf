package org.comp.demo;

public class MyFile {
    private String name;
    private String absolutePath;
    private Long size;
    private String dateCreate;
    private String dateUpdate;

    public MyFile(String name, String absolutePath, Long size, String dateCreate, String dateUpdate) {
        this.name = name;
        this.absolutePath = absolutePath;
        this.size = size;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}
