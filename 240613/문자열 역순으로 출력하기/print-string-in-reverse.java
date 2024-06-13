import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[4];
        for(int i =0; i<4; i++){
            strings[i] = sc.nextLine();

        }
        for(int i =0; i<4; i++){
            System.out.println(strings[3-i]);

        }

    }
}