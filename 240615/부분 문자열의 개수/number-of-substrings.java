import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String part = sc.nextLine();

        int count = 0;
        int index = 0;
        while((index = str.indexOf(part, index)) != -1){
            index += 1;
            count++;

        }
        System.out.println(count);
    }
}