import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        calculate(a,b);
        System.out.println(a.value+" "+ b.value);
        
    }
    public static void calculate(IntWrapper a, IntWrapper b){
        if(a.value> b.value){
            a.value += 25;
            b.value *= 2;

        }else{
            b.value += 25;
            a.value *= 2;
        }
    }

    
}
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}