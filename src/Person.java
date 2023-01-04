public class Person {
    public final String firstName;
    public final String lastName;
    public final Double salary;
    public Person(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String getInfo() {
        return String.format("Name: %s, Surname: %s, Salary: %s", firstName, lastName, salary);
    }
}
