import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int[] ints= new int[strings.length];
        int[] count = new int[9];
        for(int i = 0; i<strings.length; i++){
            int mock = 0;
            ints[i] = Integer.parseInt(strings[i]);
            if(ints[i]==0){
                break;
            }
            mock = ints[i] / 10;
            if(mock == 0){
                continue;
                }
            count[mock -1]++;

        }
        for(int i =0; i<9;i++){
            System.out.println(i+1+" - "+ count[i]);
        }


    }
}