import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students, Comparator.comparing((Student student)-> student.korean+student.english+student.math));

        for(int i=0; i<n; i++){
            System.out.println(students[i].name +" "+students[i].korean+" "+students[i].english+" "+students[i].math);
        }

    }

}
class Student{
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;


    }

}