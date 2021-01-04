package objectInputAndOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *	对象序列化 
 *		简单理解为把对象从文件中读取出来
 * @author life-1
 * @project_name IOStream
 * @type_name Test01
 * @creation_time 2019年6月17日 下午9:46:37
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		Person	p1=new	Person("李四", 36, null, 0);
		//对象序列化,	把p1对象保存到D:/java.work/IOStream/src/obj.txt文件中
		OutputStream	out=new	FileOutputStream("D:/java.work/IOStream/scourse/obj.txt");
		ObjectOutputStream	oos=new	ObjectOutputStream(out);
		
		oos.writeObject(p1);
		oos.close(); 
	}

}
