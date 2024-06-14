import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i =0; i<n; i++){
            strings[i] = sc.next();
        }
        String result = String.join("", strings);
        for(int i =0; i<result.length(); i++){
            
            System.out.print(result.charAt(i));
            if((i+1) % 5 == 0){
                System.out.println();
            }
        }
    }
}