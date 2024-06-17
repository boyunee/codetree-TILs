import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String order = sc.next();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<order.length(); i++){
            if(order.charAt(i) == 'L'){
                sb.append(str.charAt(0));
                sb.deleteCharAt(0);

            }else{
                sb.deleteCharAt(str.length() -1);
                sb.insert(0, String.valueOf(str.charAt(str.length() - 1)));

            }
            str = sb.toString();

        }
        System.out.println(str);
    }
}