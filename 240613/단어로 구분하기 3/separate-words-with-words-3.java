import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        for(int i=0; i<10; i++){
            strings[i] = sc.next();

        }
        for(int i=9; i>=0; i--){
            System.out.println(strings[i]);
            
        }
    }
}