import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result ="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                result += str.charAt(i);

            }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                result += str.charAt(i);
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                result += str.charAt(i);
            }
        }
        result = result.toLowerCase();
        System.out.println(result);
    }
}