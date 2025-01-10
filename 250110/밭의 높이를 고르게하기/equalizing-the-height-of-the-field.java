import java.util.*;
public class Main {
    public static int n,h,t;
    public static int[] b, clone;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();
        t = sc.nextInt();
        b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        clone = b.clone();
        // boolean match = false;
        // int dif = 1;
        // int count = 0;
        // boolean minMatch = false;
        // while(!match){
        //     for(int i=0; i<n; i++){
        //         if(Math.abs(h - b[i]) == dif){
        //             b[i] += (h - b[i]);
        //             minMatch = true;
        //             break;
        //         }else{
        //             minMatch = false;
        //         }
        //     }
        //     if(!minMatch){
        //         dif++;
        //         continue;
        //     }
            
        //     for(int i=0; i<n; i++){
        //         System.out.print(b[i]);
        //     }
        //     System.out.println();
        //     for(int i=0; i<n-t; i++){
        //         for(int j=i; j<i+t; j++){
        //             if(b[i] != h || b[j] != h){
                        
        //                 match = false;
        //                 break;
        //             }
        //             match = true;
        //         }
        //         if(match){
        //             break;
        //         }
        //     }
        // }

        // int min = Integer.MAX_VALUE;
        // for(int i=0; i<n-t; i++){
        //     count=0;
        //     for(int j=i; j<i+t; j++){
        //         if(b[i] != h || b[j] != h){
                    
        //             break;
        //         }
        //         count += Math.abs(clone[j] - h);
        //         if(j==i+t-1){
        //             min = Math.min(min, count);
        //         }     
        //     }
            
            
        // }


        for(int i=0; i<n; i++){
            b[i] = h;
        }
        int count =0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-t; i++){
            count = 0;
            for(int j=i; j<i+t; j++){
                count += Math.abs(clone[j] - h);
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
}