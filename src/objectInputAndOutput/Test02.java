 	package objectInputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 *	�������л�
 *			�����Ϊ���Ѷ�����ļ���ȡ���� 
 * @author life-1
 * @project_name IOStream
 * @type_name Test02
 * @creation_time 2019��6��17�� ����9:47:20
 */

public class Test02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream	in=new	FileInputStream("D:/java.work/IOStream/scourse/obj.txt");
		ObjectInputStream	ois=new	ObjectInputStream(in);
		//���ļ��ж�ȡһ������,obj��obj���͵�,	���õ���Person����
		Object	obj=ois.readObject();
		System.out.println(obj);
		ois.close();
		/*
		 * ����������
		 * 		�Ѷ������л����ļ���,����Person�������/ɾ����һ���ֶ�, �ٽ��з����л�ʱ,���������쳣��
		 * java.io.InvalidClassException: 
		 * 	objectInputAndOutput.Person; 
		 * 	local class incompatible:
		 *  stream classdesc serialVersionUID = 604385331769811039, 
		 * 	local class serialVersionUID = 7115898815537550201 
		 *
		 * ������
		 * 		Person��ʵ����Serializble�ӿں�,ϵͳ������Զ����һ��serialVersionUID���л��汾���ֶ�
		 * 		����Person�������/ɾ����һ���ֶ�,���±���,serialVersionUID�ֶλ�����һ���µ�ֵ
		 * ���������
		 * 		��֤�������л�ʱ�뷴���л�ʱserialVersionUID�ֶε�ֵҪ��ͬ
		 * 		�����ֶ������һ��serialVersionUID�ֶ�
		 * 
		 */
	}
}
