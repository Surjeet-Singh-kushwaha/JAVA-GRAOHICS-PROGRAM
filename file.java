//  to convert input number in words
// n =0 output ZERO

import java.util.*;
class File
{
    public static void main(String args[]){
        int n;
        String a[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        int m=n;
        int l = Integer.toString(m).length();
        String s="";
        while(l!=0)
        {
            int p= m%10;
            s=a[p]+" " +s;
            m/=10;
            l--;
        }
        System.out.println(s);

          sc.close();
    }

}