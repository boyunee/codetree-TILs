import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper n = new IntWrapper(sc.nextInt());
        IntWrapper m =  new IntWrapper(sc.nextInt());
        change(n, m);
        System.out.println(n.value+" "+m.value);
    }
    public static void change(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;

    }
}
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}