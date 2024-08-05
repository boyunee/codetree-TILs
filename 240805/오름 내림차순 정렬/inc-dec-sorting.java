import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ints = new Integer[n];
        for(int i=0; i<n ; i++){
            ints[i] = sc.nextInt();
        }
        Arrays.sort(ints);
        for(int i=0; i<n; i++){
            System.out.print(ints[i]+" ");
        }
        System.out.println();

        Arrays.sort(ints, Collections.reverseOrder());
        for(int i=0; i<n; i++){
            System.out.print(ints[i]+" ");
        }
    }
}