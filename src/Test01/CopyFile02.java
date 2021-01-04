package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * 	文本文件的复制
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile
 * @creation_time 2019年6月13日 下午8:10:01
 */
public class CopyFile02 {
	public static void main(String[] args) throws IOException  {
		String	src="D:\\java.work\\IOStream\\src\\FileReaderAndWriter\\Writer.java";
		String	dest="D:/java.work/File/CopyFile02copyright.txt";
//		copyfile1(src,dest); 
//		copyfile2(src,dest);
		copyfile3(src,dest);
	}
	

	//文本文件复制,一次复制一个字符,异常处理,自动关闭流
	private static void copyfile1(String srcFilename,String	destFilename) {
	try (
			FileReader fr=new FileReader(srcFilename);
			FileWriter fw=new FileWriter(destFilename);
			){
			int cc = fr.read();
			while(cc!=-1) {
				fw.write(String.valueOf(cc));
				cc=fr.read();
			}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
	
	}
	
	//文本文件复制,一次复制一个字符数组,异常处理,手动关闭流
	private static void copyfile2(String srcFilename,String	destFilename) {
		// TODO 自动生成的方法存根
		FileReader fr=null;
		FileWriter fw=null;
		try {
			try {
				fr = new FileReader(srcFilename);
				fw = new FileWriter(destFilename);
				
				char[]	contents=new	char[1024];
				int len = fr.read();
				while(len!=-1) {
					fw.write(contents,0,len);
					len = fr.read(contents);
				}
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
	//编码格式转换的方法(乱码情况下)
	private static void copyfile3(String srcFilename,String	destFilename) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(srcFilename), "GBK"));
		BufferedWriter writer =
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFilename), Charset.forName("utf-8")));
		int len = in.read();
		while(len!=-1) {
			writer.write(len);
			len = in.read();
		}
		
		
		writer.close();
		in.close();
		
		
	}

}
