import java.util.Scanner;
public class marks {
    public static void main(String args[]) {
        System.out.println("Enter the marks");
        Scanner ob = new Scanner(System.in);
        int mark = ob.nextInt();
        String grade = gradeFunction(mark);
        System.out.println("grade=" + grade);

    }

    private static String gradeFunction(int mark) {
        if (mark < 100 && mark > 90) {
            return "AA";
        }
        if (mark < 90 && mark > 80) {
            return "AB";
        }
        if (mark < 80 && mark > 70) {
            return "BB";
        }
        if (mark < 70 && mark > 60) {
            return "BC";
        }
        if (mark < 60 && mark > 40) {
            return "CC";
        }
        if (mark <= 40) {
            return "Fail";
        }
        return "Marks can't be above 100";
    }
}
