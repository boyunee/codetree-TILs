import java.util.*;
public class Main {
    public static Set<List<Integer>> beautiful = new HashSet<>();
    public static int[] b;
    public static void permute(int start, int end){
        if(start == end){
            List<Integer> clone = new ArrayList<>();
            for(int num : b){
                clone.add(num);
            }
            beautiful.add(clone);
            return;
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
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        b = new int[m];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i =0; i<m; i++){
            b[i] = sc.nextInt();
        }
        //아름다운 수열 배열 저장

        permute(0, m-1);
        // for(List<Integer> list : beautiful){
        //     for(Integer num : list){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        
        int count =0;
        for(int i=0; i<=n-m; i++){
            for(List<Integer> list : beautiful){
                
                boolean match = true;
                for (int o = 0; o < m; o++) {
                    if (a[i + o] != list.get(o)) {
                        match = false;
                        break;
                    }
                }
                if(match){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}