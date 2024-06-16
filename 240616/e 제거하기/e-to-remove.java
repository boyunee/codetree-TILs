import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = str.indexOf("e");
        if(index > str.length() -1){
            System.out.println(str);

        }

        System.out.println(str.substring(0,index)+ str.substring(index+1));
    }
}