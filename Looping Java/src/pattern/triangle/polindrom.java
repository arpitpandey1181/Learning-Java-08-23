package pattern.triangle;
//           1 
//         2 1 2 
//       3 2 1 2 3 
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 
// 6 5 4 3 2 1 2 3 4 5 6  

public class polindrom {
    public static void main(String[] args) {
        int n= 6;
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
