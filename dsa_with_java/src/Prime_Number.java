import java.util.Scanner;
public class Prime_Number {
    Scanner s1=new Scanner(System.in);
    int num=0;
    int prime_Number()
    {   int flag=0;
        System.out.print("Enter the number to check:");
        num=s1.nextInt();
        for(int i=2;i<num%2;i++)
        {
            if(num/i==0)
            {
                flag=1;
                break;
            }
            else
            {
                flag=-1;
            }
        }
        if(flag==1)
        {
            System.out.println("Number is not prime");
        }
        else if(flag==-1)
        {
            System.out.print("Number is prime");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Prime_Number p1=new Prime_Number();
        p1.prime_Number();

    }
}
