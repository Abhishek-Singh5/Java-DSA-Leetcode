import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}
