import java.util.*;
class Main{
    
    public static long factorial(long num){
        long result = 1;
        for(long i = 1; i <= num; i++)
            result = result * i;
        
        return result;
    }
        

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        long n = s1.nextLong();
        long r = s1.nextLong();
        
        if(r > n){
            System.out.println("Invalid Combination R is Never Greate then N !!");
            return;
        }
        
        long n_factorial = factorial(n);
        long nR_factorial = factorial(n - r);
        
        // n! / (n - r)!
        
        long answer = n_factorial / nR_factorial;
        System.out.println("Permutation P is :- " + answer);

    }
}
