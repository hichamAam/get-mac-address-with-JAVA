public class User {
    private String fname;
    private String lname;
    private String username;
    private String password;

    public User(String fname, String lname, String username, String password){
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
    }

    public boolean auth(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    public String toString() {
        return "User{" +
                "fisrtname:'" + this.fname + '\'' +
                "lastname:'" + this.lname + '\'' +
                "username:'" + this.username + '\'' +
                "password:'" + this.password + '\'' +
                "}";
    }
}