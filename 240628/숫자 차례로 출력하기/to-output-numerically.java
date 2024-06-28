import java.util.*;
public class Main {
    public static int count;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLow(n);
        System.out.println();
        count = n;
        printHigh(1);


    }
    public static void printLow(int n){
        if( n==0){
            return;
        }
        printLow(n-1);
        System.out.print(n+" ");
        n--;
    }
    public static void printHigh(int n){
        if(n>count) return;
        printHigh(n + 1);
        System.out.print(n + " ");
        n++;

    }
}