import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count =0;
        for( int i=a; i<=b; i++){
            if(check(i)){
                // System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }
    public static boolean check(int num){
        if(num == 100){
            return false;
        }
        else{
            if(isPrime(num) && ((int)(num / 10)+(int)(num % 10)) % 2 ==0 ){
                return true;
            }
            else{
                return false;
            }
            
        }
    }
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }
}