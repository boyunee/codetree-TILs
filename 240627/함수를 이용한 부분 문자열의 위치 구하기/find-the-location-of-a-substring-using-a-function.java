import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String part = sc.next();
        System.out.println(check(str, part));

    }
    public static int check(String str, String part){
        return str.indexOf(part);

    }
}