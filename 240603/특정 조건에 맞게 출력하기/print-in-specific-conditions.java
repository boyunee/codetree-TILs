import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        int size = 0;
        for(int i = 0; i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
            if(ints[i] == 0){
                size = i;
                break;
    
            }
        }

        for(int i = 0; i<size ; i++){
            if(ints[i] % 2 == 0){
                System.out.print(ints[i] / 2+ " ");
            }else{
                System.out.print(ints[i] + 3 + " ");
            }
        }

    }
}