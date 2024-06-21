import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        isFiveMultiple(n);
    }
    public static void isFiveMultiple(int n){
        String nToStr = Integer.toString(n);
        int sum = Integer.parseInt(String.valueOf(nToStr.charAt(0))) 
        + Integer.parseInt(String.valueOf(nToStr.charAt(1)));

        if(n % 2 == 0 && sum % 5 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}