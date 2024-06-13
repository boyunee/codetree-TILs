import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        int sum = 0;
        for(int i =0; i<10; i++){
            strings[i] = sc.next();
            sum += strings[i].length();
        }
        System.out.println(sum);

    }
}