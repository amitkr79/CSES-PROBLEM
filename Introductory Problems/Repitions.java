import java.util.Scanner;

public class Repitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();   
        int n = s.length();
        int maxLength = 0; 

        for(int i =0 ;i<n ;i++){
            int j=i; 
            int len = 0; 
            while (j<n && s.charAt(i)==s.charAt(j)) {
                len++;
                j++;
            }
            maxLength = Math.max(maxLength, len);
            i=j-1;
        }
        System.out.println(maxLength);
    }
    
}
