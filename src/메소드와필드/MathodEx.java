package 메소드와필드;

public class MathodEx {
    public static void main(String[] args) {
        say("곰돌이 사육사"); // 메소드 호출
        int rst = sum(1,2,3,4,5,6,7);
    }
    //매개변수의 개수를 모르는 경우
    static  int sum(int ... x){
        int sum =0;
        for(int i = 0; i <x.length; i++){
            sum += x[i];
        }
        return 0;
    }

    static void say(String name){
        System.out.println("Hi " + name);
    }
}
