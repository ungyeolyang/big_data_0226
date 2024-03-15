package 예외상황_사용자정의;

public class CustomExceptionEx {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
    int num1 = 100;
    int num2 = 9;
    try {
        System.out.println(ce.printEven(num1));
        System.out.println(ce.printEven(num2));
    } catch (EvenException e){
        e.printStackTrace();
    }
    }
}
class CheckEven{
    private int num;
    public void setNum(int num){
        this.num = num;
    }
    public int printEven(int num) throws EvenException{
        this.num = num;
        if(num % 2 != 0) {
            throw new EvenException(num);
        }else{
            return num;
        }
    }
}
class EvenException extends Exception{
    private Integer number = null;

    EvenException(int number){
        this.number = number; //오토박싱
    }

    @Override
    public String getMessage(){
        if(number == null) {
            return "숫자가 아닙니다.";
        }
        else{
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}
