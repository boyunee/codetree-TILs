import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        String result ="";

        for(int i=0; i< chars.length; i++){
            if(chars[i] == chars[0]){
                result += String.valueOf(chars[1]);
            }else if(chars[i] == chars[1]){
                result += String.valueOf(chars[0]);
            }else{
                result += String.valueOf(chars[i]);
            }
        }
        System.out.println(result);
        
        
    }
}