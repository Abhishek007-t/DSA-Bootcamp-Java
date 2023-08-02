import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        int age;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the age");
        age = ob.nextInt();
        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
    }
}

    

