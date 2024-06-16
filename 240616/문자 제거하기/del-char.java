import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int input =0;
        
        while(sc.hasNext()){
            char[] chars = str.toCharArray();
            input = sc.nextInt();
            if(input > str.length() - 1){
                chars[str.length() -1] = ' ';
            }else{
                chars[input] =' ';

            }
            
            str = String.valueOf(chars);
            str = str.replaceAll(" ","");
            System.out.println(str);
            
        }


    }
}