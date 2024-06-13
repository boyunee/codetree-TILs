import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[]{
            "apple", "banana" , "grape", "blueberry", "orange"
        };
        String str = sc.next();
        int count = 0;
        for(int i=0; i<strings.length; i++){

            if(str.equals(String.valueOf(strings[i].charAt(2))) || str.equals(String.valueOf(strings[i].charAt(3)))){
                System.out.println(strings[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}