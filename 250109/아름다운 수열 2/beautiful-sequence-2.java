import java.util.*;
public class Main {
    public static int[] a,b;
    public static int n,m,count;
    public static boolean[] matched;
    public static void permute(int start, int end){
        if(start == end){
            matches();
        }
        for(int i=start;i<=end; i++){
            swap(start, i);
            permute(start+1, end);
            swap(start, i);  
        }
    }
    public static void swap(int i, int j){
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }
    public static void matches(){
        for(int i=0; i<=n-m; i++){
            boolean match = true;
            for (int o = 0; o < m; o++) {
                if (a[i + o] != b[o]) {
                    match = false;
                    break;
                }
            }
            if(match && !matched[i]){
                matched[i] = true;
                count++;
            }
                       
        }
        
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        b = new int[m];
        matched = new boolean[n];
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
        permute(0, m-1);
        System.out.println(count);
    }
}