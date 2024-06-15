import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String find = sc.next();
        if(str.indexOf(find) == -1){
            System.out.println("No");
        }else{
System.out.println(str.indexOf(find));
        }
        
    }
}