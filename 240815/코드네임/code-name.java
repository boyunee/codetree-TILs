import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];

        int minScore = 100;
        int minIndex = 0;
        for(int i=0; i<5; i++){
            persons[i] = new Person(sc.next(), sc.nextInt());
            if(persons[i].score < minScore){
                minScore = persons[i].score;
                minIndex = i;
            }

        }
        System.out.println(persons[minIndex].codeName + " "+persons[minIndex].score);

    }
};

class Person{
    String codeName;
    int score;

    public Person(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
};