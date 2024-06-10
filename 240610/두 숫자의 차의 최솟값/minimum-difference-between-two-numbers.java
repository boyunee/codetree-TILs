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

        int output = ints[1] - ints[0];
        for(int i =0; i<size; i++){
            for(int j =i+1; j<size; j++){
                if(ints[j] - ints[i] <output){
                    output = ints[j] - ints[i];
                }
            }
        }

        System.out.println(output);
    }
}