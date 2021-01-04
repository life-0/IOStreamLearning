package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *	以字节为单位读取文件的内容 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadAndWriteFile
 * @creation_time 2019年6月12日 下午9:19:34
 */
public class ReadFile01 {
	public static void main(String[] args) throws IOException {
		//1)当前程序与指定的文件之间建立流通道,
		//	读取d:/abc.txt文件的内容,通过构造方法指定要访问的文件
		FileInputStream	fis=new	FileInputStream("d:/java.work/abc.txt");
		//文件内容：ABCabc
		
		//2)读写文件内容
		//read()方法从文件中读取一个字节,并把读到的字节返回,读到文件末尾
		int	cc=fis.read();
		System.out.println(cc);//65， A的码值
		cc=fis.read();
		System.out.println(cc);//66，B的码值		
		cc=fis.read();
		System.out.println(cc);//67，C的码值
		cc=fis.read();
		System.out.println(cc);//97，a的码值
		cc=fis.read();
		System.out.println(cc);//98，b的码值
		cc=fis.read();
		System.out.println(cc);//99，c的码值
		cc=fis.read();
		System.out.println(cc);// -1,	表示已经读到文件末尾
		
		//3)关闭流通到
		fis.close();
	}
}
