import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                count++;
            
                System.out.print(count+" ");
                if(count == 9 ){
                    count =0;
                }
            }
            System.out.println();
        }
    }
}