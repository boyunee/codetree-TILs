import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }
        
        Arrays.sort(students, Comparator.comparing((Student student) -> student.height)
        .thenComparing(Comparator.comparing((Student student) -> student.weight).reversed()));

        for(int i=0; i<n; i++){
            System.out.print(students[i].height+" ");
            System.out.print(students[i].weight+" ");
            System.out.print(students[i].order+" ");
            System.out.println();
        }

    }
}
class Student{
    int height, weight, order;

    public Student(int height, int weight, int order){
        this.height = height;
        this.weight = weight;
        this.order = order;

    }
}