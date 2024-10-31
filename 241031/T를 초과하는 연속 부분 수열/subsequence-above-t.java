import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] ints = new int[n];
        int count=0;
        int maxCount=0;
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
            // System.out.println(ints[i]);
            if(ints[i] > 3){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);

    }
}