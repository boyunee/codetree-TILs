import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ints= new int[n];
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
            
        }
        Arrays.sort(ints);
        System.out.println(ints[k-1]);

    }
}