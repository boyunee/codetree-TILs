import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ints = new int[size];
        for(int i =0; i<size ; i++){
            ints[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            int count = 0;
            for(int j=0; j<size; j++){
                if(ints[i] == ints[j]){
                    count++;
                    if(count > 1){ints[i] = 0;}
                }
            }
        
        }
        Arrays.sort(ints);
        if(ints[size-1] == 0){
            System.out.println("-1");
        }else{
            System.out.println(ints[size-1]);
        }
    }
}