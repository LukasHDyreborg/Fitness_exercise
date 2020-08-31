import java.util.ArrayList;

public class Menu {

    public static void menu(ArrayList<Administration> aList, ArrayList<Instructor> iList, ArrayList<Member> mList, ArrayList<Person> pList) {
        int i = 0;
        while (i == 0) {
            HelperClass.menuHeader("Main Menu");
            int choice = HelperClass.menuWriteOut(6,"Press what you would like to do!", "1. to create member!", "2. to create staff!",
                    "3. to list members!", "4. to list staff!", "5. to list all!", "6. Exit!");

            switch (choice) {
                case 1:
                    Member.createMember(mList, pList);
                    break;
                case 2:
                    Employee.createEmployee(aList, iList, pList);
                    break;
                case 3:
                    Lists.memberList(mList);
                    break;
                case 4:
                    Lists.employeeList(aList, iList);
                    break;
                case 5:
                    Lists.allList(pList);
                    break;
                case 6:
                    FileHandling.printPerson(pList);
                    FileHandling.printEmployee(aList, iList);
                    FileHandling.printMember(mList);
                    HelperClass.countStart("Goodbye!");
                    HelperClass.line(120, "");
                    i = 1;

                    break;
            }
        }
    }
}
