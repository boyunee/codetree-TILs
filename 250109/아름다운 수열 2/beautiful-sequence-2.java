import java.util.*;
public class Main {
    public static int[] a,b;
    public static int n,m,count;   

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        b = new int[m];
        int[] temp = new int[m];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i =0; i<m; i++){
            b[i] = sc.nextInt();
        }
        if(m>n){
            System.out.println(0);
            System.exit(0);
        }
        count =0;
        Arrays.sort(b, 0, m);
        for(int i=0; i<=n-m; i++){
            for(int j=0; j<m; j++){
                temp[j] = a[i+j];
            }
            Arrays.sort(temp, 0, m);
            boolean match = true;
            for(int j=0; j<m; j++){
                if(temp[j] != b[j]){
                    match = false;
                    break;
                }
            }
            if(match){
                    count++;
                }
        }
        
        System.out.println(count);
    }
}