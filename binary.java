import java.util.*;
class binary
{
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr a number");
        int x= sc.nextInt();
        int count=0;
        int arr[];
        int temp=x;
        while(temp>0){
            count++;
            temp=temp/2;
        }
        arr = new int[count];
        System.out.println(x);
         int i=0;
        while(x>0)
        {
           
            int r=x%2;
            arr[i]=r;
            x/=2;
             i++;
        }
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
        sc.close();
    }
}