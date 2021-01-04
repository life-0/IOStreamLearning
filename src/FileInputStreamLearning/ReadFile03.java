package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *	һ�ζ�ȡһ���ֽ�����
 *	��ȡ�ܶ��ֽڱ��浽�ֽ������� 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile03
 * @creation_time 2019��6��13�� ����10:12:44
 */
public class ReadFile03 {
	public static void main(String[] args) throws IOException {
		//1)�ڳ������ȡ���ļ�֮�佨����ͨ��
		FileInputStream	stored=new	FileInputStream("d:/java.work/abc.txt");
		//�ļ����ݣ�ABCabc Hello  World
		byte []	bytes=new	byte[4];
		//�����ж�ȡ�ܶ��ֽ�,���浽�ֽ�������,���ض������ֽ���,��������ļ�ĩβ����-1
		int len=stored.read(bytes);
		System.out.println(len);//4
		System.out.println(Arrays.toString(bytes));//[65, 66, 67, 97]
		
		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//�������ȡ������ֽڿ�ʼ������ȡ֮����ֽ�

		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//�������ȡ������ֽڿ�ʼ������ȡ֮����ֽ�
		
		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//�������ȡ������ֽڿ�ʼ������ȡ֮����ֽ�
		stored.close();
	}
}

