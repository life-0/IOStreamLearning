package Print;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *	Printwriter
 *		以字符为单位的打印流 
 * @author life-1
 * @project_name IOStream
 * @type_name printWriter
 * @creation_time 2019年6月19日 下午8:56:07
 */
public class printWriter {
	public static void main(String[] args) throws IOException {
		PrintWriter	pw=new	PrintWriter(new	FileWriter("D:\\java.work\\IOStream\\scourse\\def.txt"));
		pw.print("这是字符打印流");
		pw.println();
		try {
			FileInputStream	fis=new	FileInputStream("F:sadha.txt");//文件不存在
		} catch (Exception e) {
			e.printStackTrace(pw);
		}
		pw.close();
	}
}
