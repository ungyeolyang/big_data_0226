package 토커나이저;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 /기준으로 연속 입력 하세요 : ");
        String names = sc.nextLine();
        StringTokenizer st = new StringTokenizer(names, "/");
        String[] nameStr = new String[st.countTokens()];
        int idx = 0;
        while(st.hasMoreTokens()) {
            nameStr[idx++] = st.nextToken();
        }
        for(String e : nameStr) { System.out.print(e + " "); } // 토크나이져
        System.out.println();

        String[] name = names.split("/");
        for(String e : name) { System.out.print(e + " "); }

    }
}
