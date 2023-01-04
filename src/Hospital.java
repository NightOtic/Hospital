public final class Hospital {
    public static final Integer maxPeople = 5;
    public Person[] people = new Person[maxPeople];
    private Integer peopleNumber = 0;
    void add(Person person) {
        if (peopleNumber < maxPeople) {
            people[peopleNumber] = person;
            peopleNumber++;
        }
    }
    String getInfo() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < peopleNumber; i++) {
            result.append(people[i].getInfo()).append("\n");
        }
        return result.toString();
    }
}

