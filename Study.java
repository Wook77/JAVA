import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Study {
	public static void main(String[] args){
		
		File src = new File("c:\\temp\\desert.jfif"); // 원본 파일
		File dest = new File("c:\\temp\\desert2.jpg"); // 복사 파일
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try {
			fi = new FileInputStream(new File("")); // 파일 입력 문자 스트림에 연결
			fo = new FileOutputStream(dest); // 파일 출력 문자 스트림에 연결
			byte [] buf = new byte [1024*10];
			
			while (true) { // 문자 하나 읽고
				int n = fi.read(buf);
				fo.write(buf,0,n); // 문자 하나 쓰고
				if(n<buf.length)
						break;
			}
        
			
            System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}