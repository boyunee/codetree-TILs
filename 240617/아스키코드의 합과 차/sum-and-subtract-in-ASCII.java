import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.print((int)a+(int)b);
        System.out.print(" ");
        System.out.print(Math.abs((int)a-(int)b));
    }
}