import java.io.*;
import java.util.*;
public class Solution{
 
 
     public static void main(String []args){
        int t = 0;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < t; i++) {
            long n = scan.nextLong();
            long total = 0;
            if(n % 2050 == 0) {
                n /= 2050;
                while(n > 0) {
                    total += n % 10;
                    n /= 10;
                }
                System.out.println(total);
            }
            else {
                System.out.println(-1);
            }
            scan.nextLine();
        }
     }
}
