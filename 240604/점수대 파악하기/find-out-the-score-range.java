import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        int[] count = new int[10];

        for(int i =0;i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
            if(ints[i]==0){break;}
            int mock = 0;
            mock = ints[i] / 10;
            if(mock ==0){continue;}
            count[mock - 1]++;
        }
        for(int i =10; i>0; i--){
            System.out.println(i+"0 - "+count[i-1]);
        }
    }
}