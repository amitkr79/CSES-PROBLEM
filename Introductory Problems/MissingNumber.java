import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0; 
        for(int i =0; i<n-1; i++){
            sum+=in.nextLong();
        }
        long sumofnumber = n*(n+1)/2;
        System.out.println(sumofnumber-sum);
    }
    
}
