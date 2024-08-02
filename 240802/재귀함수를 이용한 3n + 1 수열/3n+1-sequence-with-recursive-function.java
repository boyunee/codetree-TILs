import java.util.*;
public class Main {
    public static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        threePlusOne(n);
    }
    public static int threePlusOne(int n){
        if(n==1){
            System.out.println(count);
            return count;
        }
        if(n%2==0){
            count++;
            return threePlusOne(n/2);
        }else{
            count++;
            return threePlusOne(n*3 +1);
        }
    }
}