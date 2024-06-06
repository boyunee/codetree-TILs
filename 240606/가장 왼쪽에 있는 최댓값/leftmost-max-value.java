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
        int index = size;
        while(index >0){
            int[] arr = Arrays.copyOfRange(ints, 0 , index);
            index = findMax(arr);
            

        }

    }

    public static int findMax(int[] arr){
        int maxIndex = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;

            }
        }
        System.out.print(maxIndex + 1+" ");
        return maxIndex;
    }
}