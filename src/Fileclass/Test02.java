package Fileclass;

import java.io.File;
import java.io.IOException;

/**
 *	�鿴�ļ����� 
 * @author life-1
 * @project_name IOStream
 * @type_name Test02
 * @creation_time 2019��6��19�� ����9:38:17
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		File	f1=new	File("D:\\java.work\\Devil5.mp4");
//		File	f1=new	File("Devil5.mp4"); //���·��,Ҫ������ĿĿ¼�µ��ļ�
		f1.createNewFile();//�����ļ�
		
		System.out.println(f1.getAbsolutePath());//���ؾ���·��(�Ӹ�Ŀ¼(C,D,E,F��)��ʼ��·��)
		System.out.println(f1.getPath());	//����·��
		System.out.println(f1.getParent());	//������һ���ļ���
		System.out.println(f1.getName());	//������ 
		System.out.println(f1.length());//�ļ��Ĵ�С
		System.out.println(f1.exists());//�ж��Ƿ����
		System.out.println(f1.isFile());//�ж��Ƿ�Ϊ�ļ�
		System.out.println(f1.isDirectory());//�ж��Ƿ�Ϊ�ļ���		
		System.out.println(f1.isAbsolute());//�ж��Ƿ�Ϊ����·��
		System.out.println(f1.lastModified());//�鿴���һ���޸ĵ�ʱ��
	}
}
