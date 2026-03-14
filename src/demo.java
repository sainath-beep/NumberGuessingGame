// Create User:
// Fields: username, password
// Method: login(String username, String password)
// Return true if credentials match object data.

class User {
    private String username;
    private String password;

    User(String s, String p) {
        this.username = s;
        this.password = p;
    }

    boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }
}
public class demo {
    public static void main(String[]args){
        User u =new User("sainath","sainath");
        u.login("sainath","sainath");
    }
}