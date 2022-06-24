package application;

public class User {
    private String fname;
    private String sname;
    private String pname;

    public User(String fname, String sname, String pname){
        this.fname = fname;
        this.sname = sname;
        this.pname =pname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
