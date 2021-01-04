package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;


/**
 *	字符缓冲流
 *	BufferedReader/BufferedWriter
 *	 也是一种处理流,包装流  
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile04
 * @creation_time 2019年6月17日 下午8:31:17
 */
public class CopyFile04 {
	public static void main(String[] args) throws IOException {
//		m1();	//使用BufferedReader读取文本文件内容
		m2();	//使用BufferedWriter保存文本到文件中
		m3();	//从键盘上输入文本,把这些文本保存到文件中
	}

	private static void m3() throws IOException {
		BufferedWriter	bw=new	BufferedWriter(new	FileWriter("D:\\java.work\\IOStream\\src\\BUFFERED.txt"));
		//使用BufferedReader对键盘输入流缓冲
		//System.in是标准的输入设备,即键盘
		BufferedReader	br=new	BufferedReader(new	InputStreamReader(System.in));
		
		String	line=br.readLine();
		while(line.length()>0) {
			bw.write(line);//保存一行
			bw.newLine();//新创建一行
			line=br.readLine();
			
		}
		
		br.close();
		bw.close();
		
	}

	private static void m2() throws IOException {
		Writer	out=new	FileWriter("D:\\java.work\\IOStream\\src\\BUFFERED.txt",true);
		BufferedWriter	bw=new	BufferedWriter(out);
		
		bw.write("23333333\r\n");
		bw.write("木大木大木大木大木大木大木");
		
//		bw.flush();//清空缓冲区,把数据保存到文件中
		bw.close();
		
	}

	private static void m1() throws IOException {
		Reader	in=new	FileReader("D:\\java.work\\IOStream\\src\\Writer.java");
		BufferedReader	br=new	BufferedReader(in);
		
		//从缓冲字符流中读取一行,读到文件末尾返回null
		String	line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();//把包装流关闭后,被包装的流也会关闭
	}
}
