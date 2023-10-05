import java.util.Date;

public abstract class Empleado  extends User{
    private Date contractDate;
    private String role;

    public Empleado(String name, String lastname, long cc, String email, Date contractDate, String role) {
        super(name, lastname, cc, email);
        this.contractDate = contractDate;
        this.role = role;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

}
