import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i=0; i<n; i++){
            strings[i] = sc.next();
        }
        String find = sc.next();
        int count =0;
        double sum =0;
        for(int i=0; i<n; i++){
            if(strings[i].startsWith(find)){
                count++;
                sum += strings[i].length();

            }
        }
        double mean = sum / count;
        System.out.printf("%d %.2f", count, mean);
        

    }
}