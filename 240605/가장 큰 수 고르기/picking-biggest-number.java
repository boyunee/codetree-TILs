import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        for(int i=0; i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        int max = ints[0];
        for(int i=0; i<ints.length; i++){
            if(ints[i] > max){
                max = ints[i];
            }

        }
        System.out.println(max);
    }
}