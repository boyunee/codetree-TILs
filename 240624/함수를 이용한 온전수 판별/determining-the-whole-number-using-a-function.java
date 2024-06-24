import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count =0;
        for(int i=a; i<=b; i++){
            if(check(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(int num ){

        if((num % 2 == 0) || (num % 10 == 5)||((num % 3 ==0) && (num % 9 != 0))){
            return false;
        }else{
            return true;
        }
    }
}