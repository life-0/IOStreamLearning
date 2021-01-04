package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 	异常处理
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile05
 * @creation_time 2019年6月13日 上午10:46:57
 */
public class ReadFile05 {

	public static void main(String[] args) {
		m1();//一次读取一个字节,手动关闭流,异常处理
		m2();//从文件中读取字节保存到字节数组中,异常处理,可实现自动关闭
		
	}
	
	private static void m2() {
		// TODO 自动生成的方法存根
		//从JDK7开始,流可以自动关闭
		try (	//try资源块,自动释放
				FileInputStream	fis=new FileInputStream("d:/java.work/abc.txt");
				){
			byte[]	bytes=new byte[4];
			int len =fis.read(bytes);
			while(len!=-1) {
				System.out.print(new String(bytes,0,len));
				len=fis.read(bytes);
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

	public static	void m1() {
		FileInputStream fis=null;
		try {
			fis = new	FileInputStream("d:/java.work/abc.txt");
			
			int	cc=fis.read();
			while(cc!=-1) {
				System.out.print((char)cc);
				cc=fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(fis!=null) {//如果fis为null的话，无法关闭流,会出现空指针异常，所以判断
				try {
					fis.close();
					System.out.println();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}//关闭流,释放系统资源				
			}
		}
	}

}
