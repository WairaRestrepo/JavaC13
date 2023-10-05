public abstract class Adopter  extends User{
    private long phone;
    private String dateOfAdoption;
    private String preferencesOfAdoption;

    public Adopter(String name, String lastname, long cc, String email, long phone, String dateOfAdoption, String preferencesOfAdoption) {
        super(name, lastname, cc, email);
        this.phone = phone;
        this.dateOfAdoption = dateOfAdoption;
        this.preferencesOfAdoption = preferencesOfAdoption;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(String dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public String getPreferencesOfAdoption() {
        return preferencesOfAdoption;
    }

    public void setPreferencesOfAdoption(String preferencesOfAdoption) {
        this.preferencesOfAdoption = preferencesOfAdoption;
    }

}
