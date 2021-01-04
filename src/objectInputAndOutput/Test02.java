 	package objectInputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 *	对象反序列化
 *			简单理解为：把对象从文件读取出来 
 * @author life-1
 * @project_name IOStream
 * @type_name Test02
 * @creation_time 2019年6月17日 下午9:47:20
 */

public class Test02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream	in=new	FileInputStream("D:/java.work/IOStream/scourse/obj.txt");
		ObjectInputStream	ois=new	ObjectInputStream(in);
		//从文件中读取一个对象,obj是obj类型的,	引用的是Person对象
		Object	obj=ois.readObject();
		System.out.println(obj);
		ois.close();
		/*
		 * 场景描述：
		 * 		把对象序列化到文件后,又在Person类中添加/删除了一个字段, 再进行反序列化时,产生以下异常：
		 * java.io.InvalidClassException: 
		 * 	objectInputAndOutput.Person; 
		 * 	local class incompatible:
		 *  stream classdesc serialVersionUID = 604385331769811039, 
		 * 	local class serialVersionUID = 7115898815537550201 
		 *
		 * 分析：
		 * 		Person类实现了Serializble接口后,系统会给类自动添加一个serialVersionUID序列化版本号字段
		 * 		当在Person类中添加/删除了一个字段,重新编译,serialVersionUID字段会生成一个新的值
		 * 解决方法：
		 * 		保证对象序列化时与反序列化时serialVersionUID字段的值要相同
		 * 		可以手动的添加一个serialVersionUID字段
		 * 
		 */
	}
}
