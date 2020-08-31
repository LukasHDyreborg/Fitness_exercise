import java.util.ArrayList;

public class Lists {

    public static void memberList(ArrayList<Member> memberList) {
        HelperClass.countStart("FITNESS MEMBERS");
        setup(38, "Name", "Cpr", "Member type", "Fee");
        stars();
        for (int i = 0; i < memberList.size(); i++) {
            String membership = Member.getMemberType(memberList.get(i).isBasic());
            String fee = Integer.toString(Member.monthlyFee(memberList.get(i).isBasic()));
            setup(38, memberList.get(i).getName(), memberList.get(i).getCpr(), membership, fee);
        }
        endLine();
    }

    public static void employeeList(ArrayList<Administration> adminList, ArrayList<Instructor> instructorList) {
        HelperClass.countStart("FITNESS EMPLOYEES");
        setup(17,"Name", "Cpr", "hours", "Salary", "Vacation");
        stars();
        for (int i = 0; i < adminList.size(); i++) {
            String hours = Integer.toString(adminList.get(i).getHours());
            String salary = Integer.toString(adminList.get(i).getSalary());
            String vacation = Integer.toString(adminList.get(i).getVacation());

            setup(17, adminList.get(i).getName(), adminList.get(i).getCpr(), hours, salary, vacation);
        }
        for (int i = 0; i < instructorList.size(); i++) {
            String hours = Integer.toString(instructorList.get(i).getHours());
            String salary = Integer.toString(instructorList.get(i).getSalary());

            setup(38, instructorList.get(i).getName(), instructorList.get(i).getCpr(), hours, salary);
        }
        endLine();
    }

    public static void allList(ArrayList<Person> pList) {
        HelperClass.countStart("EMPLOYEES & MEMBERS Name and cpr");
        setup(80, "Name", "Cpr");
        stars();
        for (int i = 0; i < pList.size(); i++) {
            setup(80, pList.get(i).getName(), pList.get(i).getCpr());
        }
        endLine();
    }

    public static void setup(int value, String ... args) {
        System.out.print("|");
        for (String s : args) {
            letterValue(s);
        }
        for (int i = 0; i < value; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void letterValue(String s) {
        int value = 20-s.length();
        System.out.print(s);
        for (int i = 0; i <= value; i++) {
            System.out.print(" ");
        }
    }

    public static void stars() {
        System.out.print("|");
        for (int i = 0; i <= 121; i++) {
            System.out.print("*");
        }
        System.out.println("|");
    }

    public static void endLine() {
        System.out.print("|");
        for (int i = 0; i <= 121; i++) {
            System.out.print("=");
        }
        System.out.println("|");
    }
}
