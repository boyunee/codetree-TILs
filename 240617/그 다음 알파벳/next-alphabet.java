import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        if((int)alphabet == 122){
            System.out.print('a');

        }else{
            System.out.print((char)((int)alphabet + 1));
        }
    }
}