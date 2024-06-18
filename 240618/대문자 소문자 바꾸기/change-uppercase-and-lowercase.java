import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result ="";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                result += String.valueOf(str.charAt(i)).toUpperCase();


            }else{
                result += String.valueOf(str.charAt(i)).toLowerCase();

            }
            
        }
        System.out.println(result);


    }
}