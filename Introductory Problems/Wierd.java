import java.util.Scanner;

class Wierd{
    public static void main(String args[]){
       
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        while(true){
            System.out.print(n+" ");
            if(n==1) break;
            if(n%2==0){
                n/=2;
            }else{
                n = n*3+1;
            }
        }
    }
}