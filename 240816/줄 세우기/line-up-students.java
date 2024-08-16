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

        Arrays.sort(students, Comparator.comparing((Student student)-> student.height)
        .thenComparing(student -> student.weight)
        .reversed()
        .thenComparing(student -> student.num));

        for(int i=0; i<n; i++){
            System.out.println(students[i].height +" "+students[i].weight+" "+students[i].num);
        }

    }

}
class Student{
    int height,weight, num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;


    }

}