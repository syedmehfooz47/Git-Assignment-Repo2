public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate() {
        // Simple authentication logic with improved validation
        if (username != null && !username.isEmpty() && 
            password != null && !password.isEmpty()) {
            // Fixed: Added trim() to remove whitespace issues
            if (username.trim().equals("admin") && password.trim().equals("admin123")) {
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Invalid credentials!");
        return false;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
