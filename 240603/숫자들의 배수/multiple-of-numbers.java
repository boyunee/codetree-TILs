import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check = 0;
        int i = 1;
        int result = 0;
        while(check <2){
            result = num * i;
            if(result % 5 == 0){
                check++;
            }
            System.out.print(result + " ");
            i++;
        }
    }
}