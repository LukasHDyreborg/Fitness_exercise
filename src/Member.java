import java.util.ArrayList;

public class Member extends Person{

    private boolean isBasic;


    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public Member(boolean isBasic) {
        this.isBasic = isBasic;
    }

    public static void createMember(ArrayList<Member> memberList, ArrayList<Person> personList) {
        HelperClass.countStart("What is the name?");
        String name = HelperClass.input();
        HelperClass.countStart("What is the CPR?");
        String cpr = HelperClass.input();
        HelperClass.listWriteOut("There is 2 types of membership", "1. Basic costs 199 kr",
                "2. Full costs 299 kr", "What type of membership?", "Press 1 for Basic!", "Press 2 for Full!");
        boolean isBasic = HelperClass.inputIntAsBoolean();

        Member m = new Member(name, cpr, isBasic);
        memberList.add(m);
        Person p = new Person(name, cpr);
        personList.add(p);

        HelperClass.countStart("The Member is now created!");
        HelperClass.line(120,"");
    }

    public static int monthlyFee(boolean isBasic) {
        if (isBasic) {
            return 199;
        } else {
            return 299;
        }
    }

    public static String getMemberType(boolean isBasic) {
        if (isBasic) {
            return "Basic";
        } else {
            return "Full";
        }
    }

    @Override
    public String toString() {
        String membership = getMemberType(isBasic);
        int price = monthlyFee(isBasic);
        return (getName() + ", " + getCpr() + ", " + membership + ", " + price);
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }
}
