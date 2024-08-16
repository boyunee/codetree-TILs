import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i=0; i<5; i++){
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(students, Comparator.comparing((Student student)-> student.name));

        System.out.println("name");
        for(int i=0; i<5; i++){
            System.out.println(students[i].name +" "+students[i].height +" "+students[i].weight);
        }

        Arrays.sort(students, Comparator.comparing((Student student)-> student.height).reversed());

        System.out.println();
        System.out.println("height");
        for(int i=0; i<5; i++){
            System.out.println(students[i].name +" "+students[i].height +" "+students[i].weight);
        }

    }

}
class Student{
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;


    }

}