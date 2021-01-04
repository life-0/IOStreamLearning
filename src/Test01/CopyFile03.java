package Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * FileReader/FileWriter只能读写与当前环境编码兼容的文本文件
 * 如果不兼容与当前环境编码不兼容，应使用InputStreamReader/OutStreamWriter转换流读写
 * 转换流采用了适配器设计模式
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile03
 * @creation_time 2019年6月16日 下午8:28:39
 */
public class CopyFile03 {
	public static void main(String[] args) throws IOException {
//		m1();//使用InputStreamReader读取文件内容
		m2();//使用OutputStreamWriter保存数据
	}
	//当前操作的文件编码与当前环境不兼容,使用OutputStreamWriter把字符以指定的编码转为字节
	private static void m2() throws IOException {
		//把字符保存到:"D:\\java.work\\IOStream\\src\\abc.txt"
		//	该文件是UTF-8编码,当前环境是GBK编码,字符转换为UTF-8格式再保存
		OutputStream	out=new	FileOutputStream("D:\\java.work\\IOStream\\src\\abc.txt",true);
		OutputStreamWriter	osw=new	OutputStreamWriter(out,"UTF-8");
		osw.write("\r\n");
		osw.write("当前的内容是使用转换流保存到文件中的, 工作区编码为：GBK编码");
		osw.close();
		out.close();
	}

	// 当文本文件的编码与当前编码不兼容时，使用InputStreamReader类来读取
	private static void m1() throws IOException {
	//读取D:\java.work\IOStream\src\xyz.txt	该文件使用GBK编码,当前环境使用GBK编码
		InputStream	in=new	FileInputStream("D:\\java.work\\IOStream\\src\\xyz.txt");
		//使用GBK编码,把in字节流中的数据转换为字符流
			//使用转换流的初衷是为了控制解码字符集，而只有节点流按byte读取，才可以设置字符集
			//所以用转换流将字节流转换为字符流
		InputStreamReader	isr=new	InputStreamReader(in, "GBK");//如果改为UTF-8就会出现乱码
		
		int cc = isr.read();
		while(cc!=-1) {
			System.out.print((char)cc);
			cc = isr.read();
		}
		
		isr.close();
	}
}
