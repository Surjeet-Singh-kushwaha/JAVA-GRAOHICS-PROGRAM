//import java.lang.Thread;
class A extends Thread{
    public void run(){
        for(int i =1;i<6;i++){
            System.out.println("\tFrom Thread A: i = "+i);
        }
        System.out.println("Exit form A");
    }
}
class B extends Thread{
     public void run(){
        for(int j =1;j<6;j++){
            System.out.println("\tFrom Thread B: j = "+j);
        }
        System.out.println("Exit form B");
    }
}
class C extends Thread{
     public void run(){
        for(int k =1;k<6;k++){
            System.out.println("\tFrom Thread C: k = "+k);
        }
        System.out.println("Exit form C");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
         new A().start();
      new B().start();;
    //     new C().start();;
    // 

    }
}
