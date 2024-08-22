import java.util.*;
public class Main {
    public static int[] ints;
    public static int[] newInts;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ints = new int[n];
        for(int i =0; i<n; i++){
            ints[i] = sc.nextInt();
        }
        newInts = ints.clone();
        Arrays.sort(newInts);

        for(int i =0; i<n; i++){
            System.out.print(find(ints[i]) +" ");
        }

    


    }
    public static int find(int x){
        for(int i=0; i<newInts.length; i++){
            if(x == newInts[i]){
                newInts[i] = 0;
                return i+1;
            }
        }
        return -1;
    }
}