import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        int sum =0;
        for(int i=0; i<n; i++){
            strings[i] = sc.next();
            sum += strings[i].length();
        }; 
        int count =0;
        for(int i=0; i<n; i++){
            if(strings[i].startsWith("a")){
                count++;
            }
            
        };  
        System.out.println(sum +" "+ count);
        }
}