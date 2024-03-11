package 코코아톡만들기;

public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 전달할 메세지

    public CocoaTalk(String name){
        to = name;
    }

    public void writeMsg(String msg){
        this.msg =to +" : "+ msg;
    }

    public void send(NetworkAdapter na){
        na.send(msg);
    }
}
