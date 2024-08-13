import java.util.*;
public class Main {
    public static String a,b;
    public static String check(){
        char[] chars1 = a.toCharArray();
        Arrays.sort(chars1);
        String c = new String(chars1);

        char[] chars2 = b.toCharArray();
        Arrays.sort(chars2);
        String d = new String(chars2);
        if(c.equals(d)){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        System.out.println(check());

    }
}