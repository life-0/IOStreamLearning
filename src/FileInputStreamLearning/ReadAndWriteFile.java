package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *	���ֽ�Ϊ��λ��ȡ�ļ������� 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadAndWriteFile
 * @creation_time 2019��6��12�� ����9:19:34
 */
public class ReadAndWriteFile {
	public static void main(String[] args) throws IOException {
		//1)��ǰ������ָ�����ļ�֮�佨����ͨ��
		FileInputStream	fis=new	FileInputStream("d:/abc.text");
		
		//2)��д�ļ�����
		fis.read();
		
		//3)�ر���ͨ��
		fis.close();
	}
}
