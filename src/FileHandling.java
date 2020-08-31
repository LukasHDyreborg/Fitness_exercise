import java.io.*;
import java.util.ArrayList;

public class FileHandling {

    public static void printPerson(ArrayList<Person> pList) {
        try {
            PrintStream output = new PrintStream(new File("src/Person.txt"));
            for (int i = 0; i < pList.size(); i++) {
                output.println(pList.get(i).getName() + " " + pList.get(i).getCpr());
            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        }
    }

    public static void readPerson(ArrayList<Person> pList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Person.txt"));
            ArrayList<String> list = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            for (int i = 0; i < list.size(); i++) {
                String[] person = cut(list.get(i));
                Person p = new Person(person[0], person[1]);
                pList.add(p);
            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        } catch (IOException e) {
            HelperClass.countStart("Could not read the line!");
        }
    }

    public static String[] cut(String text) {
        String[] person = text.split(" ");
        return person;
    }

    public static void printEmployee(ArrayList<Administration> aList, ArrayList<Instructor> iList) {
        try {
            PrintStream output = new PrintStream(new File("src/Employee.txt"));
            for (int i = 0; i < aList.size(); i++) {
                output.println(aList.get(i).getName() + " " + aList.get(i).getCpr() + " " + aList.get(i).getHours() +
                        " " + aList.get(i).getSalary() + " " + aList.get(i).getVacation());
            }
            for (int i = 0; i < iList.size(); i++) {
                output.println(iList.get(i).getName() + " " + iList.get(i).getCpr() + " " + iList.get(i).getHours() +
                        " " + iList.get(i).getSalary());
            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        }
    }

    public static void readEmployee(ArrayList<Administration> aList, ArrayList<Instructor> iList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Employee.txt"));
            ArrayList<String> list = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            for (int i = 0; i < list.size(); i++) {
                String[] person = cut(list.get(i));

                int hours = Integer.parseInt(person[2]);
                int salary = Integer.parseInt(person[3]);

                if (person.length == 4) {
                    Instructor p = new Instructor(person[0], person[1], hours, salary);
                    iList.add(p);
                } else if (person.length == 5) {
                    int vacation = Integer.parseInt(person[4]);
                    Administration p = new Administration(person[0], person[1], hours, salary, vacation);
                    aList.add(p);
                }
            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        } catch (IOException e) {
            HelperClass.countStart("Could not read the line!");
        }
    }

    public static void printMember(ArrayList<Member> mList) {
        try {
            PrintStream output = new PrintStream(new File("src/Member.txt"));
            for (int i = 0; i < mList.size(); i++) {
                output.println(mList.get(i).getName() + " " + mList.get(i).getCpr() + " " + mList.get(i).isBasic());
            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        }
    }

    public static void readMember(ArrayList<Member> mList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Member.txt"));
            ArrayList<String> list = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            for (int i = 0; i < list.size(); i++) {
                String[] person = cut(list.get(i));
                if (person[2].equals("true")) {
                    Member p = new Member(person[0], person[1], true);
                    mList.add(p);
                } else if (person[2].equals("false")) {
                    Member p = new Member(person[0], person[1], false);
                    mList.add(p);
                }

            }
        } catch (FileNotFoundException e) {
            HelperClass.countStart("Could not find the file!");
        } catch (IOException e) {
            HelperClass.countStart("Could not read the line!");
        }
    }
}
