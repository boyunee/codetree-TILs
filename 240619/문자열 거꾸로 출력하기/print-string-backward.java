import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        String str ="";
        while(sc.hasNext()){
            str = sc.next();
            if(str.equals("END")){
                break;
            }
            sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }
    }
}