package Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * FileReader/FileWriterֻ�ܶ�д�뵱ǰ����������ݵ��ı��ļ�
 * ����������뵱ǰ�������벻���ݣ�Ӧʹ��InputStreamReader/OutStreamWriterת������д
 * ת�������������������ģʽ
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile03
 * @creation_time 2019��6��16�� ����8:28:39
 */
public class CopyFile03 {
	public static void main(String[] args) throws IOException {
//		m1();//ʹ��InputStreamReader��ȡ�ļ�����
		m2();//ʹ��OutputStreamWriter��������
	}
	//��ǰ�������ļ������뵱ǰ����������,ʹ��OutputStreamWriter���ַ���ָ���ı���תΪ�ֽ�
	private static void m2() throws IOException {
		//���ַ����浽:"D:\\java.work\\IOStream\\src\\abc.txt"
		//	���ļ���UTF-8����,��ǰ������GBK����,�ַ�ת��ΪUTF-8��ʽ�ٱ���
		OutputStream	out=new	FileOutputStream("D:\\java.work\\IOStream\\src\\abc.txt",true);
		OutputStreamWriter	osw=new	OutputStreamWriter(out,"UTF-8");
		osw.write("\r\n");
		osw.write("��ǰ��������ʹ��ת�������浽�ļ��е�, ����������Ϊ��GBK����");
		osw.close();
		out.close();
	}

	// ���ı��ļ��ı����뵱ǰ���벻����ʱ��ʹ��InputStreamReader������ȡ
	private static void m1() throws IOException {
	//��ȡD:\java.work\IOStream\src\xyz.txt	���ļ�ʹ��GBK����,��ǰ����ʹ��GBK����
		InputStream	in=new	FileInputStream("D:\\java.work\\IOStream\\src\\xyz.txt");
		//ʹ��GBK����,��in�ֽ����е�����ת��Ϊ�ַ���
			//ʹ��ת�����ĳ�����Ϊ�˿��ƽ����ַ�������ֻ�нڵ�����byte��ȡ���ſ��������ַ���
			//������ת�������ֽ���ת��Ϊ�ַ���
		InputStreamReader	isr=new	InputStreamReader(in, "GBK");//�����ΪUTF-8�ͻ��������
		
		int cc = isr.read();
		while(cc!=-1) {
			System.out.print((char)cc);
			cc = isr.read();
		}
		
		isr.close();
	}
}
