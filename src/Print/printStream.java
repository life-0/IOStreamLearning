package Print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *	PrintStream
 *		???????? 
 * @author life-1
 * @project_name IOStream
 * @type_name printStream
 * @creation_time 2019??6??19?? ????8:17:31
 */
public class printStream {
	public static void main(String[] args) throws IOException {
		//1)???????????????
		OutputStream	ops=new	FileOutputStream("D:\\java.work\\IOStream\\scourse\\log.txt",true);
		PrintStream		pstream=new	PrintStream(ops);
			pstream.print("hello");
			pstream.println("world");
		
		//2)System???out???????PrintStream?????????	
			//System.out????????????��???????
			System.out.println("?????????????????");
			//???????System.out????????
			System.setOut(pstream);
			System.out.println("????????????????????????????????pstream???��???log.txt");
			
		//3)??????????????��????????
			try {
				FileInputStream	fis=new	FileInputStream("F:add.txt");//?????????
			} catch (Exception e) {
				//??????????????e.printStackTrace()????????????????????????????
				//??????????????????????????
				e.printStackTrace(pstream);
				
			}
			pstream.close();
			
			
			
			
			
	}
}
