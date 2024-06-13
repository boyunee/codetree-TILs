import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int[] ints = new int[]{
            str1.length(), str2.length(), str3.length()
        };
        Arrays.sort(ints);
        System.out.println(ints[2] - ints[0]);

    }
}