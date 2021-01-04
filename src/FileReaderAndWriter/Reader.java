package FileReaderAndWriter;

import java.io.FileReader;
import java.io.IOException;

/**
 *	FileReader/FileWriter 
 *		以字符为单位，只能读写纯文本文件，要求文本文件的编码格式要与当前环境的编码格式兼容(然很可能出错)
 * @author life-1
 * @project_name IOStream
 * @type_name ReaderAndwriter
 * @creation_time 2019年6月13日 下午9:27:30
 */
public class Reader {
	public static void main(String[] args) throws IOException {
//		m1();	//通过FileReader读取内容，一次读取一个字节
		m2();	//读取文本文件内容，一次读取一个字符数组，异常处理，自动关闭
	}

	private static void m2() {
		try (
			FileReader	fr=new	FileReader("D:\\life000\\src\\SWING.java");
				){
			char[]	contents=new char[1024];
			int len = fr.read(contents);
			while(len!=-1) {
				//把读到的len个字符进行处理，字符转换为字符串打印
				System.out.print(new String(contents,0,len));
				len = fr.read(contents);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static void m1() throws IOException {
		//建立流通道
//		FileReader	fr=new	FileReader("d:/java.work/abc.txt");
	//abc.txt虽然是GBK编码，当前环境是GBK编码，abc.txt文件中都是英文字符，英文字符无论在GBK还是在UTF-8中都是一个字符
	//如果文件是UTF-8格式，文件有中文，读取是会出现乱码
		
		//一般使用FileReader读取当前环境编码一致的文件
		FileReader	fr=new	FileReader("D:\\java.work\\IOStream\\bin\\IOLearning\\IO流");
		//read()方法一次读取一个字符，返回字符的码值，读到文件末尾返回-1
		int	cc=fr.read();
		while(cc!=-1) {
			//把字符打印到屏幕上
			System.out.print((char)cc);
			cc=fr.read();
		}
		fr.close();
	}
}
