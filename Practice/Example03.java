package practice;

public class Example03 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());
            System.out.println(e.hashCode());
            System.out.println(e.toString());
            System.out.println(e.getLocalizedMessage());
        }
        catch(Exception e){
            System.out.println(" somthing is wrong");
            // System.out.println(e.getMessage());
            // System.out.println(e.hashCode());
            // System.out.println(e.toString());
            // System.out.println(e.getLocalizedMessage());
        }finally{
            System.out.println("final line of this code");
        }
    }
    
}
