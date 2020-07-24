import java.util.*;
class Calcii{
    public static long power(int n,int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");      
        }
        else if(n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        else {
            long result = (long)(Math.pow(n,p));
            return result;
        }
    }
    
}

public class Solution {
    public static final Calcii cl = new Calcii();
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (sc .hasNextInt()) {
            int n = sc .nextInt();
            int p = sc .nextInt();
            
            try {
                System.out.println(cl.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
