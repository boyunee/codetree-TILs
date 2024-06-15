import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String part = sc.nextLine();

        int index = 0;
        int count = 0;
        if(str.contains(part)){
            while((index = str.indexOf(part, index)) != -1){
            count++;
            index += 1;
            System.out.println(count);

        }

        }else{
            System.out.println(str.indexOf(part));

        }
        
    }
}