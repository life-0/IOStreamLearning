package objectInputAndOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *	�������л� 
 *		�����Ϊ�Ѷ�����ļ��ж�ȡ����
 * @author life-1
 * @project_name IOStream
 * @type_name Test01
 * @creation_time 2019��6��17�� ����9:46:37
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		Person	p1=new	Person("����", 36, null, 0);
		//�������л�,	��p1���󱣴浽D:/java.work/IOStream/src/obj.txt�ļ���
		OutputStream	out=new	FileOutputStream("D:/java.work/IOStream/scourse/obj.txt");
		ObjectOutputStream	oos=new	ObjectOutputStream(out);
		
		oos.writeObject(p1);
		oos.close(); 
	}

}
