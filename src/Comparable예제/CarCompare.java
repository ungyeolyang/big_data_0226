package Comparable예제;

public class CarCompare implements Comparable<CarCompare>{
    String modelName;
    int modelYear;
    String color;

    public CarCompare(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarCompare o) {
        if(this.modelYear == o.modelYear)
            //return 0;
        //비교조건으로 연도가 같은경우에 0으로 return하면  같은객체로 인식하고 삭제해버림
            return this.modelName.compareTo(o.modelName);
        else if(this.modelYear < o.modelYear) return -1;
        else return 1;
    };
}
