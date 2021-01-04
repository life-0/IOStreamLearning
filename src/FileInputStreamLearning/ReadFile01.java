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
public class ReadFile01 {
	public static void main(String[] args) throws IOException {
		//1)��ǰ������ָ�����ļ�֮�佨����ͨ��,
		//	��ȡd:/abc.txt�ļ�������,ͨ�����췽��ָ��Ҫ���ʵ��ļ�
		FileInputStream	fis=new	FileInputStream("d:/java.work/abc.txt");
		//�ļ����ݣ�ABCabc
		
		//2)��д�ļ�����
		//read()�������ļ��ж�ȡһ���ֽ�,���Ѷ������ֽڷ���,�����ļ�ĩβ
		int	cc=fis.read();
		System.out.println(cc);//65�� A����ֵ
		cc=fis.read();
		System.out.println(cc);//66��B����ֵ		
		cc=fis.read();
		System.out.println(cc);//67��C����ֵ
		cc=fis.read();
		System.out.println(cc);//97��a����ֵ
		cc=fis.read();
		System.out.println(cc);//98��b����ֵ
		cc=fis.read();
		System.out.println(cc);//99��c����ֵ
		cc=fis.read();
		System.out.println(cc);// -1,	��ʾ�Ѿ������ļ�ĩβ
		
		//3)�ر���ͨ��
		fis.close();
	}
}
