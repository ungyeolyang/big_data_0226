package Properties;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
// Properties 키와 값을 String 타입으로 제한 (설정 정보 등을 파일에 쓰기 위해)
// HashTable을 상속받아 기능 제한해서 사용
public class PropertiesEx {
    public static void main(String[] args) throws IOException {

                Properties properties = new Properties();
                // 현재 파일의 경로를 지정
                String path = PropertiesEx.class.getResource("./database.properties").getPath(); //. 현재위치 .. 상위위치
                path = URLDecoder.decode(path, "utf-8"); // utf -8로 디코딩 해서 path를 읽어라, 한글이 포함된 경우를 위해
                properties.load(new FileReader(path));// 경로에 파일을 읽기
                String driver = properties.getProperty("driver"); // 키값으로 프로퍼티 가져오기
                String url = properties.getProperty("url");
                String username = properties.getProperty("username");
                String password = properties.getProperty("password");
                System.out.println("drive : " + driver);
                System.out.println("url : " + url);
                System.out.println("username : " + username);
                System.out.println("password : " + password);
    }
}

