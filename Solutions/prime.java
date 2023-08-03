import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        int count=0;
        System.out.println("Enter the number");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0) {
                count++;
            }
        }
        if(count<=2){
            System.out.println("prime number");
        }else{
            System.out.print("not prime number");
        }
    }

}
