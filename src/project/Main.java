package project;
import java.util.Arrays;
import java.util.List;

/* Files : OO - 2 - Members.csv, OO - 2 - Participation.csv, OO - 2 - Statuses.csv, OO - 2 - Surveys.csv */

public class Main {
    public static void main(String[] args) {
        myScanner sc = new myScanner("OO - 2 - Members.csv", "OO - 2 - Participation.csv",
                "OO - 2 - Statuses.csv", "OO - 2 - Surveys.csv");
        List<String> members = sc.getMembers();
        //System.out.println("elso sor a memberbe: " + members.get(0));
        //Arrays.stream(members)
    }

    public static Integer addTwoNumber(int a, int b){
        return a + b;
    }
}

