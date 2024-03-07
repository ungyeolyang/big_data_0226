package 에어컨설계;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConditionerEx {
    public static void main(String[] args) throws InterruptedException{
        AirConditioner lgAirCon = new AirConditioner();
        Scanner sc = new Scanner(System.in);

        int elapsedTime = 0;
        boolean isSetTemp = false;

        System.out.print("에어컨을 켜시겠습니까?(yes/no) : ");
        String isOn = sc.next();

        if (isOn.equals("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirconState();
            while (true) {
                sleep(1000); // 1초 대기
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1: if (elapsedTime >= 60) isSetTemp = true;
                        break;
                    case 2: if (elapsedTime >= 30) isSetTemp = true;
                        break;
                    case 3: if (elapsedTime >= 20) isSetTemp = true;
                        break;
                    default: if (elapsedTime >= 61) isSetTemp = true;
                }

                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airconInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.^^");
                    break;
                }
            }
        }
    }
}
