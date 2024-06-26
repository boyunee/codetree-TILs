import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(check(A));
        
    }
    public static String check(String A){
        for(int i=0; i<A.length(); i++){
            if(A.charAt(0) != A.charAt(i)){
                return "Yes";
                

            }
        }
        return "No";
    } 
}