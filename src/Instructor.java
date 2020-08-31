import java.util.ArrayList;

public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public Instructor(int hours, int salary) {
        super(hours, salary);
    }

    public static void createInstructor(ArrayList<String> p, ArrayList<Instructor> instructorList, ArrayList<Person> personList) {
        HelperClass.countStart("How many hours?");
        int hours = HelperClass.inputInt();
        int salary = (hours * 456);

        Instructor i = new Instructor(p.get(0), p.get(1), hours, salary);
        instructorList.add(i);
        Person person = new Person(p.get(0), p.get(1));
        personList.add(person);

        HelperClass.countStart("The Instructor is now created!");
        HelperClass.line(120,"");
    }

    @Override
    public String toString() {
        return (getName() + ", " + getCpr() + ", " + getHours() + ", " + getSalary());
    }
}
