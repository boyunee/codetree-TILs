import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum= 0;
        int evenSum = 0;
        for(int i = 1; i<=10; i++){
            arr[i-1] = sc.nextInt();
            if(i %2 == 0){
                evenSum += arr[i-1];
            }else{
                oddSum += arr[i-1];
            }
        }
        int result = Math.abs(evenSum - oddSum);
        System.out.println(result);
    }
}