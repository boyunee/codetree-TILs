import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[][] strings = new String[5][3];
        for(int i =0; i<5; i++){
            for(int j=0; j<3; j++){
                strings[i][j]= sc.next().toUpperCase();
                
            }
        }
        for(int i =0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.print(strings[i][j]+" ");
                if(j==2){
                    System.out.print("\n");
                }
                
            }
        }


    }
}