import java.util.ArrayList;

public class Administration extends Employee {

    private int vacation;

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary);
        this.vacation = vacation;
    }

    public Administration(int hours, int salary, int vacation) {
        super(hours, salary);
        this.vacation = vacation;
    }

    public static void createAdministrator(ArrayList<String> p, ArrayList<Administration> adminList, ArrayList<Person> personList) {
        Administration a = new Administration(p.get(0), p.get(1), 37, 23000, 5);
        adminList.add(a);
        Person person = new Person(p.get(0), p.get(1));
        personList.add(person);

        HelperClass.countStart("The Administrator is now created!");
        HelperClass.line(120,"");
    }

    @Override
    public String toString() {
        return (getName() + ", " + getCpr() + ", " + getHours() + ", " + getSalary() + ", " + getVacation());
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
