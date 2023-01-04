public class  Doctor extends Person {
    private final Double  bonus;
    public Doctor(String firstName, String lastName, Double salary,Double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " Premia : " + bonus + "\n";
    }
}
