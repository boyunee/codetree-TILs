import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        for(int i=0; i<n1; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++){
            B[i] = sc.nextInt();
        }

        boolean same = false;
        for(int i=0; i<A.length; i++){
            if(A[i]== B[0]){
                if(i+B.length > A.length){
                    break;
                }
                for(int j=0; j<B.length; j++){
                    
                    if(A[i+j]==B[j]){
                        same = true;
                    }else{
                        same = false;
                        break;
                    }

                }
            }
        
        
        }

        if(same){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            
        }



    }
}