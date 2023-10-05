public abstract class Adminstrator extends User {
    private int ID;
    private String role;

    public Adminstrator(String name, String lastname, long cc, String email, int ID, String role) {
        super(name, lastname, cc, email);
        this.ID = ID;
        this.role = role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
