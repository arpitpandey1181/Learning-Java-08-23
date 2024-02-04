package practice;
class Tata extends Thread{
   @Override
   public void run(){
    for(int i = 1; i < 10; i++){
        try{
        Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Wxception....");
        }
        System.out.println("love");
    }
    System.out.println("thread = 1");
   }
}
class Byy extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 10; i++){
            try{
            Thread.sleep(3000);
            }catch(Exception e){
                System.out.println("Wxception....");
            }
            System.out.println("you");
    }
    System.out.println("thread = 2");
 }
}
public class Example04 {
    public static void main(String[] args) throws InterruptedException{
        Byy t1 = new Byy();
        Tata t2 = new Tata();
        t1.run();
        
        t2.run();
        //t2.join();
        System.out.println("hello");
    }
    
}
