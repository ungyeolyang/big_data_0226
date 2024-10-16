package 저항;

import java.util.Scanner;

    public class Regist {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[][] regist = {{"black", "0", "1"}, {"brown", "1", "10"}, {"red", "2", "100"},
                    {"orange", "3", "1,000"}, {"yellow", "4", "10,000"}, {"green", "5", "100,000"},
                    {"blue", "6", "1,000,000"}, {"violet", "7", "10,000,000"}, {"grey", "8", "100,000,000"},
                    {"white", "9", "1,000,000,000"}};
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            for (int i = 0; i < regist.length; i++) {
                if (regist[i][0].contains(a)) {
                    a = regist[i][1];
                }
                if (regist[i][0].contains(b)) {
                    b = regist[i][1];
                }
                if (regist[i][0].contains(c)) {
                    c = regist[i][2].substring(1);
                }
            }
            System.out.println(a + b + c);
        }
    }

//        String[] regists = {"black", "brown", "red", "orange", "yellow", "green",
//                "blue", "violet", "grey", "white"};
//        String first = sc.next();
//        String second = sc.next();
//        String third = sc.next();
//        int findex = 0, sindex =0, tindex = 0;
//
//        for(int i = 0; i < regist.length; i++){
//            if(regists[i].equals(first)){
//                findex = i;
//            }
//            if(regists[i].equals(second)){
//                sindex = i;
//            }
//            if(regists[i].equals(third)){
//                tindex = i;
//            }
//        }
//        System.out.println(((findex*10)+sindex)* Math.pow(10,tindex));
//    }
//} // math.pow() 사용하자

