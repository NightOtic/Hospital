public final class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Lara ",  "Croft ", 3000.0,500.0));
        hospital.add(new Nurse("Diana ",  "McGregor ", 2000.0,3.0));
        System.out.println("Workers :");
        System.out.println(hospital.getInfo());
    }
}
