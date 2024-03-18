package 연습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class sample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        TreeSet<Student> list = new TreeSet<>();
        try {
            inputStream = new FileInputStream("Score.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] strings = line.split(" ");
            String name = strings[0];
            int sum = Integer.parseInt(strings[1]) + Integer.parseInt(strings[2])+Integer.parseInt(strings[3]);
            float avg = sum/3;
            list.add(new Student(name,sum,avg));
        }
        int i =1;
        for(Student e : list){
            System.out.printf("%d. %s, %d, %.2f\n", i++, e.getName(),e.getSum(),e.getAvg());
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private float avg;
    private int sum;


    public Student(String name, int sum, float avg) {
        this.name = name;
        this.sum = sum;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public int getSum(){
        return sum;
    }
    public float getAvg(){
        return avg;
    }

    @Override
    public int compareTo(Student s) {
        if(this.sum == s.sum)
            return this.name.compareTo(s.name);
        else if(this.sum > s.sum) return -1;
        else return 1;
    }
}



