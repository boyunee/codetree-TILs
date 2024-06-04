import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        for(int i =0; i<3; i++){
            String cold = sc.next();
            int temperature = sc.nextInt();
            if(cold.equals("Y")){
                if(temperature >=37){count[0]++;}
                else{count[2]++;}
            }else{
                if(temperature >=37){count[1]++;}
                else{count[3]++;}
            }
        }

        for(int i=0; i<count.length; i++){
            System.out.print(count[i]+" ");
        }
        if(count[0]>=2){System.out.print("E ");}

    }
}