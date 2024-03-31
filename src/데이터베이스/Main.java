package 데이터베이스;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    static String myId;
    static String myNickName;

    public static void main(String[] args) {
        menuSelect();
    }

    public static void menuSelect() {
        String title = "영양제 추천 사이트";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("┌" + "- ".repeat(title.length()) + "-" + "┐");
            System.out.println("│   " + title + "   │");
            System.out.println("└" + "- ".repeat(title.length()) + "-" + "┘");
            System.out.println("[1]로그인 [2]회원가입 [3]종료");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    LogInDAO logIn = new LogInDAO();
                    logIn.logIn();
                    myId = LogInDAO.id;
                    myNickName = LogInDAO.nickName;
                    break;
                case 2:
                    RegisterDAO register = new RegisterDAO();
                    register.memberInsert();
                    break;
                case 3:
                    System.out.println("메뉴를 종료 합니다");
                    return;
                default: break;
            }

            if (myId != null) {
                mainSelect();
            }
        }
    }
    public static void mainSelect() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("┌" + "- ".repeat(7) + "-" + "┐");
            System.out.println("│    메인페이지   │");
            System.out.println("└" + "- ".repeat(7) + "-" + "┘");
            System.out.println("[1]마이페이지 [2]검색 [3]로그아웃");
            int sel1 = sc.nextInt();
            switch (sel1) {
                case 1: myPageSelect();
                    break;
                case 2:
                    SearchDAO search = new SearchDAO();
                    BoardDAO board = new BoardDAO();
                    TreeSet<NutrientsVO> set = search.search();
                    if(set.isEmpty()) break;
                    search.printNutrients(set);
                    NutrientsVO vo = board.boardNut();
                    HashSet<String> set1 = board.boardEFF(vo);
                    List<BoardVO> list= board.boardList(vo);
                    board.printBoard(vo,set1,list);
                    while (true) {
                        System.out.println("[1]댓글쓰기, [2]돌아가기");
                        int sel = sc.nextInt();
                        sc.nextLine();
                        switch (sel) {
                            case 1: board.comment(vo);
                                break;
                            case 2:
                                break;
                            default:
                                continue;
                        }
                        break;
                    }
                    break;
                case 3:
                    System.out.println("로그아웃 합니다");
                    return;
            }
        }
    }

    public static void myPageSelect(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("┌" + "- ".repeat(myNickName.length() + 7) + "-" + "┐");
            System.out.println("│    " + myNickName + "님의 페이지   │");
            System.out.println("└" + "- ".repeat(myNickName.length() + 7) + "-" + "┘");
            System.out.println("[1]내정보 [2]작성한 댓글 [3]돌아가기");
            int sel2 = sc.nextInt();
            switch (sel2) {
                case 1:
                    MyInfoDAO myInfo = new MyInfoDAO();
                    MemberVO vo = myInfo.myInfo();
                    myInfo.printMyInfo(vo);
                    while (true) {
                        System.out.println("[1]수정 [2]회원탈퇴 [3]돌아가기");
                        int sel = sc.nextInt();
                        switch (sel) {
                            case 1: myInfo.updateMyInfo();
                                break;
                            case 2:
                                System.out.println("정말 회원탈퇴 하시겠습니까?");
                                System.out.println("[1]회원탈퇴 [2]돌아가기");
                                int sel1 = sc.nextInt();
                                switch (sel1) {
                                    case 1: myInfo.deleteMyInfo();
                                        Main.myId = null;
                                        Main.myNickName = null;
                                        return;
                                    case 2:
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            default:
                                continue;
                        }
                        break;
                    }
                    continue;
                case 2:
                    SearchDAO search = new SearchDAO();
                    BoardDAO board = new BoardDAO();
                    List<BoardVO> list= search.searchBoard();
                    search.printMyContent(list);
                    if(list.isEmpty()) {System.out.println("작성한 댓글이 없습니다."); break;}
                    while (true) {
                        System.out.println("[1]수정 [2]삭제 [3]돌아가기");
                        int sel = sc.nextInt();
                        switch (sel) {
                            case 1: board.updateContent();
                                break;
                            case 2: board.deleteContent();
                                break;
                            case 3: break;
                            default:
                                continue;
                        }
                        break;
                    }
                    continue;
                case 3:
                    return;
                default:
            }
        }
    }
}

