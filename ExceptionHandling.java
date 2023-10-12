public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=5;
        float x;
        int y;
        try{
           x=a/(b-c);
           System.out.println("X = "+x);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        y=a/(b+c);
        System.out.println("Y = "+y);
    }
}
