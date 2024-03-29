package 데이터베이스;

import java.sql.Date;
public class MemberVO {

    private String USER_ID;
    private String USER_PW;
    private String USER_NAME;
    private String USER_NICK;

    public String getUSER_ID() {
        return USER_ID;
    }

    public String getUSER_PW() {
        return USER_PW;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public String getUSER_NICK() {
        return USER_NICK;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public void setUSER_PW(String USER_PW) {
        this.USER_PW = USER_PW;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public void setUSER_NICK(String USER_NICK) {
        this.USER_NICK = USER_NICK;
    }
}
