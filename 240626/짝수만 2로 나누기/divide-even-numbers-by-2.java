import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        division2(ints);
        for(int i=0; i<n; i++){
            System.out.print(ints[i]+" ");
        }
        
    }
    public static void division2(int[] arr){
        for(int i=0; i<arr.length; i++){
            if( arr[i]% 2==0){
                arr[i] /= 2;
            }
        }
    }
}