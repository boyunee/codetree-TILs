import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        for(int i =0; i<10; i++){
            strings[i] = sc.next();
            if(i % 2 == 0){
                System.out.println(strings[i]);
            }
        }

    }
}