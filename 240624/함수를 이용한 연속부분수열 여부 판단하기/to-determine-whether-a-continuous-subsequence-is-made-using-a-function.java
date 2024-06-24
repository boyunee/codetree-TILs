import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String A="",B ="";
        for(int i=0; i<n1; i++){
            A = A + sc.next();
            
        }
        // System.out.println(A);
        for(int i=0; i<n2; i++){
            B+= sc.next();
            
        }
        // System.out.println(B);
        if(A.contains(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        
    }
}