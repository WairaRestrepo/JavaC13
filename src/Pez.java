public class Pez extends Animal{

    public Pez(String name, String age, String species, String healStatus, String description, boolean available) {
        super(name, age, species, healStatus, description, available);
    }

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }

    @Override
    public String getHealStatus() {
        return super.getHealStatus();
    }

    @Override
    public void setHealStatus(String healStatus) {
        super.setHealStatus(healStatus);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }

    @Override
    public void setAvailable(boolean available) {
        super.setAvailable(available);
    }

    @Override
    public String mostrarDatos() {
        return null;
    }


    @Override
    public String desplazar() {
        return null;
    }
}
