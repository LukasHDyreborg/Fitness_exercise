import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<>();
        ArrayList<Member> mList = new ArrayList<>();
        ArrayList<Instructor> iList = new ArrayList<>();
        ArrayList<Administration> aList = new ArrayList<>();


        FileHandling.readPerson(pList);
        FileHandling.readEmployee(aList, iList);
        FileHandling.readMember(mList);

        HelperClass.header("FITNESS");
        Menu.menu(aList, iList, mList, pList);
    }
}
