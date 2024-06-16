import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        String two = String.valueOf(chars[1]);
        while( str.indexOf(two) != -1){
            chars[str.indexOf(two)] = chars[0];
            str = String.valueOf(chars);
        }
        System.out.println(str);
    }
}