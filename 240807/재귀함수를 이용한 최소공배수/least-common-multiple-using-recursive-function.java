import java.util.*;
public class Main {
    public static int[] ints;
    public static int result=1;
    public static int find(int n){
        if(n<0){
            for(int i=0; i<ints.length; i++){
                result *= ints[i];
            }
            return result;
        }

        if(ints[n]==1){
            return find(n-1);
        }else{
            for(int i=2;  i<=ints[n]; i++){
            int count =0;
            for(int j=0; j<ints.length; j++){
                if(ints[j] % i == 0){
                    count++;
                    if(count >=2){
                        result *=i;
                        divide(i);
                        break;
                    }
                }

            }
        }
            return find(n-1);
        }
        
        
    }
    public static void divide(int m){
        for(int i=0; i<ints.length; i++){
            if(ints[i] %m ==0){
                ints[i] /= m;
            }
        }

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        ints = new int[l];
        for(int i =0; i<l; i++){
            ints[i] = sc.nextInt();
        }
        System.out.println(find(l-1));



    }
}