package 단어정렬;

import java.util.*;

//입력할 단어수를 받고 단어를 입력받아 중복이없이 출력한다.
//길이가 짤은 순으로 길이가 같으면 사전순으로 정렬한다.

public class Sort {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine(); //버퍼비우기 위에 있는 num에서 발생할수 있는 문제를 해결하기위해

        HashSet<String> hash = new HashSet<>();
        for(int i = 0; i < num; i++){
             hash.add(sc.nextLine()); // 줄바꿈 기준으로 입력받음, 해쉬로 바로 입력 받아도 됨
        }
        String[] arr = hash.toArray(new String[0]);// String형태로 0번째 인덱스부터

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 양수일경우 변경
                else if(o1.length() == o2.length()){
                    return  o1.compareTo(o2); //사전순 정렬
                }
                return -1;
            }
        };

            Arrays.sort(arr,comp);
            for(String e : arr){
            System.out.println(e);
             }
        }
    }

