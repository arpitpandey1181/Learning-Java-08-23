package whileloop.assignment;

// 1. Write a Java program that prompts the user for a number and prints the sum of all numbers from 1 to that number using a while loop.
  
public class Question1Sol {
    public static void main(String[] args) {
        
        int r,sum=0,temp;    
            int n=454;//It is the number variable to be checked for palindrome  
            
            temp=n;    
            while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;               
            n=n/10;                       
            }    
            if(temp==sum)    
            System.out.println("palindrome number ");    
            else    
            System.out.println("not palindrome");    
            }  

    
}
