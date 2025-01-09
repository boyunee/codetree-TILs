import java.util.*;
public class Main {
    public static int n,maxLen,sum,d;
    public static final int MAX = 101;
    public static int[] ints = new int[MAX];
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            String str = sc.next();
            if(str.equals("G")){
                ints[x] = 1;
            }else{
                ints[x] = 2;
            }
        }
        
        //G,H만으로 이뤄질때
        maxLen = 0;
        d = 0;
        int now = 0;
        for(int i=0; i<MAX; i++){
            if(ints[i] == 0){
                continue;
            }
            d = 0;
            now = ints[i];
            for(int j=i+1; j<MAX; j++){  
                if(ints[j] == 0){
                    continue;
                }             
                if(ints[j] == now){
                    d = j-i;
                }else{
                    break;
                }
                
                
            }
            // System.out.println(d);
            maxLen = Math.max(d, maxLen);
        }
        // System.out.println(maxLen);
        //G,H의 갯수가 같이 이뤄질때
        for(int i=0; i<MAX; i++){
            if(ints[i] == 0){
                continue;
            }
            sum = 0;
            d = 0;
            int count = 0;
            for(int j=i; j<MAX; j++){
                if(ints[j] == 0){
                    continue;
                }          
                sum += ints[j];
                count++;
                if((sum % 3 ==0) && (count % 2 == 0)){
                    d = j-i;
                }
            }
            maxLen = Math.max(d, maxLen);
        }
        System.out.println(maxLen);


    }
}