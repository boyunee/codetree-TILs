import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String result ="";

        int count =0;
        for(int i=0; i<str.length();i++){
            if(i == 0){
                count++;
                continue;
            }else if(i == str.length() -1){
                if(str.charAt(i) != str.charAt(i-1)){
                    result += str.charAt(i-1);
                    result += String.valueOf(count);
                    result += str.charAt(i);
                    result += String.valueOf(1);
                }else{
                    count++;
                    result += str.charAt(i-1);
                    result += String.valueOf(count);

                }

            }
            if(str.charAt(i) != str.charAt(i-1)){
            
                result += str.charAt(i-1);
                result += String.valueOf(count);
                count =1;
                
            }else{
                count++;
            }


        }
        System.out.println(result.length());
        System.out.println(result);
        
        
    }
}