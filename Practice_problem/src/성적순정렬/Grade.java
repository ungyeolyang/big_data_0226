package 성적순정렬;
//학생 수를 입력받고 이름, 성적순으로 입력받는다
//학생 이름을 성적이 낮은순으로 출력한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int grade = sc.nextInt();
            list.add(new Student(name, grade));
        }
        for (Student e : list) {
            System.out.print(e.name + " ");
        }
    }
     static class Student implements Comparable<Student>{
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student o) {
            if(this.grade < o.grade) return 1;
            else if(this.grade == o.grade)
                return this.name.compareTo(o.name);
            else  return -1;
        }
    }
}

