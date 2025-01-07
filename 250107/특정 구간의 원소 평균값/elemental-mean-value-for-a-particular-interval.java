import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for(int i =0; i<n; i++){
            ints[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                float avg = 0;
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += ints[k];
                }
                // System.out.println(sum);
                avg = (float) sum / (j-i+1);
                for(int k=i; k<=j; k++){
                    if(ints[k] == avg){
                        count++;
                        // System.out.println(i+"~"+j+"평균은"+avg);
                        break;
                    }
                }
            }
        }


        System.out.println(count);

    }
}