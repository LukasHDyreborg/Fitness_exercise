import java.util.ArrayList;

public class Employee extends Person {

    private int hours;
    private int salary;

    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public static void createEmployee(ArrayList<Administration> adminList, ArrayList<Instructor> instructorList, ArrayList<Person> personList) {
        ArrayList<String> p = new ArrayList<>();
        HelperClass.countStart("What is the name?");
        p.add(HelperClass.input());
        HelperClass.countStart("What is the CPR?");
        p.add(HelperClass.input());
        HelperClass.listWriteOut("Administrator or Instructor", "Press 1. Administrator!",
                "Press 2. Instructor!");
        Boolean administrator = HelperClass.inputIntAsBoolean();
        if (administrator) {
            Administration.createAdministrator(p, adminList, personList);
        } else {
            Instructor.createInstructor(p, instructorList, personList);
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
