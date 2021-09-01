package demo;

public class Student{

    private String username;
    private String firstname;
    private String lastname;
    private char origin;

    public Student(String username, String firstname, String lastname, String origin){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.origin = origin.charAt(0);
    }

    public Student(String username, String firstname, String lastname){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getOrigin() {
        return origin;
    }

    public void setOrigin(char origin) {
        this.origin = origin;
    }

}
