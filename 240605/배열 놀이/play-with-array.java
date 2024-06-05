import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] ints = new int[n];
        for(int i = 0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        int count = 0;
        while(count < q){
            int questionNum = sc.nextInt();
            switch(questionNum){
                case 1: 
                int a = sc.nextInt();
                System.out.println(ints[a -1]);
                break;

                case 2:
                int b =sc.nextInt();
                boolean same = false;
                for(int i =0; i<ints.length; i++){
                    if(b == ints[i]){
                        System.out.println(i+1);
                        same = true;
                        break;
                    }
                }
                if(!same){
                    System.out.println("0");
                }
                break;

                case 3:
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int i = s-1; i<e; i++){
                    System.out.print(ints[i]+" ");
                }
                break;
                
        }
        count++;
        }
        
        
    }
}