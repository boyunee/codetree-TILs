import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.print(int1 + " " + int2 + " ");

        int temp = 0;
        for(int i =0; i<8; i++){
            temp = int1 + int2;
            if(temp >= 10){
                temp = temp %10;
            }
            int1 = int2;
            int2 = temp;
            System.out.print(temp + " ");
        }
    }
}