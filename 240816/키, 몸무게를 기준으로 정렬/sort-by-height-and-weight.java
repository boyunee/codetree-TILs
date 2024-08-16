import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students, Comparator.comparing((Student student)-> student.height)
        .thenComparing(Comparator.comparing((Student student) -> student.weight).reversed()));

        for(int i=0; i<n; i++){
            System.out.println(students[i].name +" "+students[i].height +" "+students[i].weight);
        }

    

    }

}
class Student{
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;


    }

}