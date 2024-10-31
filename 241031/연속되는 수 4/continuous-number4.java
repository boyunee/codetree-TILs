import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        int count=0;
        int maxCount=0;
        for(int i=0; i<n; i++){
            ints[i] = sc.nextInt();
            if(i==0 || ints[i] <= ints[i-1]){
                count =1;
                if(count > maxCount){
                    maxCount = count;
                }
            } else{
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
        }
        System.out.println(maxCount);

    }
}