import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        String str = Integer.toString(sum);

        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;

            }
        }
        System.out.println(count);
    }
}