import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(check(sb));

    }
    public static String check(StringBuilder sb){
        String str =sb.toString();
        String reversed = sb.reverse().toString();
        
        if(str.equals(reversed)){
            return "Yes";
        }else{
            return "No";
        }

    }
}