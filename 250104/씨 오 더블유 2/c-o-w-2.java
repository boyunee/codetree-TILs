import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int count = 0;
        for(int i=0; i<n-2;i++){
            if(str.charAt(i)=='C'){
                for(int j=i+1; j<n-1; j++){
                    if(str.charAt(j)=='O'){
                        for(int l=j+1; l<n; l++){
                            if(str.charAt(l)=='W') count++;
                        }
                    }
                    
                }
            }
            
        }

        System.out.println(count);
    }
}