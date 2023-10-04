package pattern.dimond;
//       *                                                                                                       
//      ***                                                                                                      
//     *****                                                                                                     
//    *******                                                                                                    
//   *********                                                                                                   
//  ***********                                                                                                  
// *************                                                                                                 
//  ***********                                                                                                  
//   *********                                                                                                   
//    *******                                                                                                    
//     *****                                                                                                     
//      *** 
//       *    

public class DimondParttern01 {
    public static void main(String[] args) {
        int n =7;
        for(int i = 1; i <= n; i++){
           for(int j = n-1; j >= i; j--){
            System.out.print(" ");
           }
           for(int j = 1; j <= i*2-1; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n*2 -1- i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
