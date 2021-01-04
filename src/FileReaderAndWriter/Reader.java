package FileReaderAndWriter;

import java.io.FileReader;
import java.io.IOException;

/**
 *	FileReader/FileWriter 
 *		���ַ�Ϊ��λ��ֻ�ܶ�д���ı��ļ���Ҫ���ı��ļ��ı����ʽҪ�뵱ǰ�����ı����ʽ����(Ȼ�ܿ��ܳ���)
 * @author life-1
 * @project_name IOStream
 * @type_name ReaderAndwriter
 * @creation_time 2019��6��13�� ����9:27:30
 */
public class Reader {
	public static void main(String[] args) throws IOException {
//		m1();	//ͨ��FileReader��ȡ���ݣ�һ�ζ�ȡһ���ֽ�
		m2();	//��ȡ�ı��ļ����ݣ�һ�ζ�ȡһ���ַ����飬�쳣�����Զ��ر�
	}

	private static void m2() {
		try (
			FileReader	fr=new	FileReader("D:\\life000\\src\\SWING.java");
				){
			char[]	contents=new char[1024];
			int len = fr.read(contents);
			while(len!=-1) {
				//�Ѷ�����len���ַ����д����ַ�ת��Ϊ�ַ�����ӡ
				System.out.print(new String(contents,0,len));
				len = fr.read(contents);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static void m1() throws IOException {
		//������ͨ��
//		FileReader	fr=new	FileReader("d:/java.work/abc.txt");
	//abc.txt��Ȼ��GBK���룬��ǰ������GBK���룬abc.txt�ļ��ж���Ӣ���ַ���Ӣ���ַ�������GBK������UTF-8�ж���һ���ַ�
	//����ļ���UTF-8��ʽ���ļ������ģ���ȡ�ǻ��������
		
		//һ��ʹ��FileReader��ȡ��ǰ��������һ�µ��ļ�
		FileReader	fr=new	FileReader("D:\\java.work\\IOStream\\bin\\IOLearning\\IO��");
		//read()����һ�ζ�ȡһ���ַ��������ַ�����ֵ�������ļ�ĩβ����-1
		int	cc=fr.read();
		while(cc!=-1) {
			//���ַ���ӡ����Ļ��
			System.out.print((char)cc);
			cc=fr.read();
		}
		fr.close();
	}
}
