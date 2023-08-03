import java.util.Scanner;
public class sumnum {
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the first num");
        int first=ob.nextInt();
        System.out.println("Enter the second num");
        int second= ob.nextInt();
        num(first,second);
    }
public static void num(int numA,int numB){
        int sum=0;
         sum=numA+numB;
         System.out.println("The sum of 2 number is"+sum);
}
}
