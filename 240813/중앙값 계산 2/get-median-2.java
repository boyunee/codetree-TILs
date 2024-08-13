import java.util.*;
public class Main {
    public static ArrayList<Integer> ints = new ArrayList<>();
    public static void printMidValue(){
        Collections.sort(ints);
        int midIndex = ints.size() / 2;
        System.out.print(ints.get(midIndex)+" ");

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i=0; i<n; i++){
            ints.add(sc.nextInt());
            if(i % 2==0){
                printMidValue();
            }
            
        }


    }
}