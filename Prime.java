// program to check 
import java.util.*;
class Prime
{
    public static void main(String[] args) {
        int n,f=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n= sc.nextInt();
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f=0;
                break;
            }

        }
        if(f==-1)
        System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
sc.close();
    }
}