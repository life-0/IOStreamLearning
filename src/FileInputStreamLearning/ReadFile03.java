package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *	一次读取一个字节数组
 *	读取很多字节保存到字节数组中 
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile03
 * @creation_time 2019年6月13日 上午10:12:44
 */
public class ReadFile03 {
	public static void main(String[] args) throws IOException {
		//1)在程序与读取的文件之间建立流通道
		FileInputStream	stored=new	FileInputStream("d:/java.work/abc.txt");
		//文件内容：ABCabc Hello  World
		byte []	bytes=new	byte[4];
		//从流中读取很多字节,保存到字节数组中,返回读到的字节数,如果读到文件末尾返回-1
		int len=stored.read(bytes);
		System.out.println(len);//4
		System.out.println(Arrays.toString(bytes));//[65, 66, 67, 97]
		
		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//以上面读取的最后字节开始继续读取之后的字节

		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//以上面读取的最后字节开始继续读取之后的字节
		
		len=stored.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));//以上面读取的最后字节开始继续读取之后的字节
		stored.close();
	}
}

