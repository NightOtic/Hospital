public class Nurse extends Person{
    private final double overtime;
    public Nurse(String firstName, String lastName, Double salary,Double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " nadgodziny: " + overtime + "\n";
    }
}
