package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *	一次读取一个字节数组
 *	读取很多字节保存到字节数组中
 *		循环读取 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile03
 * @creation_time 2019年6月13日 上午10:12:44
 */
public class ReadFile04 {
	public static void main(String[] args) throws IOException {
		//1)在程序与读取的文件之间建立流通道
		FileInputStream	stored=new	FileInputStream("d:/java.work/abc.txt");
		//文件内容：ABCabc Hello  World
		byte []	bytes=new	byte[4];
		//从流中读取很多字节,保存到字节数组中,返回读到的字节数,如果读到文件末尾返回-1
		int len=stored.read(bytes);
		while(len!=-1) {
			//当读取了len个字节保存到bytes数组中,	对len个字节进行读取
			//把读到的len个字节转换为字符串(new	String(bytes[]	bytes , 0, len))
			System.out.print(new	String(bytes,0,len));
			//继续读取
			len=stored.read(bytes);
			
		}
		stored.close();
	}
}

