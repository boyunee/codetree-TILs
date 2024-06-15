import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        int index =0;

        while((index = str.indexOf("ee", index)) != -1){
            count++;
            index += 1;

        }
        System.out.print(count+" ");
        count =0;
        while((index = str.indexOf("eb", index)) != -1){
            count++;
            index += 1;

        }
        System.out.print(count+" ");

        
    }
    
}