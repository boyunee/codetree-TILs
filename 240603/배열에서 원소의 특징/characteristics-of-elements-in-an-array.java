import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[10];
        for(int i = 0; i< 10; i++){
            intArr[i] = sc.nextInt();
            if(intArr[i] % 3 == 0){
                System.out.println(intArr[i-1]);
                break;
            }
        }
    }
}