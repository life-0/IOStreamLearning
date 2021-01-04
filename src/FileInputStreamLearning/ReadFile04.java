package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *	һ�ζ�ȡһ���ֽ�����
 *	��ȡ�ܶ��ֽڱ��浽�ֽ�������
 *		ѭ����ȡ 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile03
 * @creation_time 2019��6��13�� ����10:12:44
 */
public class ReadFile04 {
	public static void main(String[] args) throws IOException {
		//1)�ڳ������ȡ���ļ�֮�佨����ͨ��
		FileInputStream	stored=new	FileInputStream("d:/java.work/abc.txt");
		//�ļ����ݣ�ABCabc Hello  World
		byte []	bytes=new	byte[4];
		//�����ж�ȡ�ܶ��ֽ�,���浽�ֽ�������,���ض������ֽ���,��������ļ�ĩβ����-1
		int len=stored.read(bytes);
		while(len!=-1) {
			//����ȡ��len���ֽڱ��浽bytes������,	��len���ֽڽ��ж�ȡ
			//�Ѷ�����len���ֽ�ת��Ϊ�ַ���(new	String(bytes[]	bytes , 0, len))
			System.out.print(new	String(bytes,0,len));
			//������ȡ
			len=stored.read(bytes);
			
		}
		stored.close();
	}
}

