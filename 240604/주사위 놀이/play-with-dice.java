import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        int[] count = new int[6];
        for(int i = 0; i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
            count[ints[i]-1]++;
        }

        for(int i = 0; i<6; i++){
            System.out.println(i+1 +" - "+count[i]);
        }

    }
}