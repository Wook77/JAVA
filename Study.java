import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Study {
	public static void main(String[] args){
		
		File src = new File("c:\\temp\\desert.jfif"); // ���� ����
		File dest = new File("c:\\temp\\desert2.jpg"); // ���� ����
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try {
			fi = new FileInputStream(new File("")); // ���� �Է� ���� ��Ʈ���� ����
			fo = new FileOutputStream(dest); // ���� ��� ���� ��Ʈ���� ����
			byte [] buf = new byte [1024*10];
			
			while (true) { // ���� �ϳ� �а�
				int n = fi.read(buf);
				fo.write(buf,0,n); // ���� �ϳ� ����
				if(n<buf.length)
						break;
			}
        
			
            System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
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