import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ints = new int[size];
        for(int i =0; i<size; i++){
            ints[i] = sc.nextInt();

        }
        int benefit = 0;
        for(int i =0; i<size; i++){
            for(int j=i; j<size; j++){
               if(ints[i]< ints[j] && ints[j] - ints[i] > benefit){
                benefit = ints[j] - ints[i];

               } 
            }
        }
        System.out.println(benefit);
        
    }
}