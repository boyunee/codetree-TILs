import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] =sc.nextInt();
        }

        int count =0 ;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(ints[i]<= ints[j] && ints[j] <= ints[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}