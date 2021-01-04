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
public class ReadAndWriteFile {
	public static void main(String[] args) throws IOException {
		//1)当前程序与指定的文件之间建立流通道
		FileInputStream	fis=new	FileInputStream("d:/abc.text");
		
		//2)读写文件内容
		fis.read();
		
		//3)关闭流通道
		fis.close();
	}
}
