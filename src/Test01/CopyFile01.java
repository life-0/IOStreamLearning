package Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 	文件的复制
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile
 * @creation_time 2019年6月13日 下午8:10:01
 */
public class CopyFile01 {

	public static void main(String[] args)  {
//		String	src="D:/java.work/File.txt";
//		String	dest="D:/java.work/CopyFile";
		String	src="D:\\java.work\\Devil5.mp4";
		String	dest="D:/java.work/DevilMayCryCopy5.mp4";
		FileCopy1(src,dest);

	}
	//一次复制一个字节数组,异常处理,自动关闭流
	public static	void FileCopy(String srcFileName,String	destFilename)  {
		try (
				 FileInputStream	fis=new	FileInputStream(srcFileName);
				 FileOutputStream	fos=new	FileOutputStream(destFilename);
				){
				byte[]	bytes=new byte[1024];	// 字节数组一般是1024的偶数倍
				int len = fis.read(bytes);
				while(len!=-1){
					fos.write(bytes,0,len);
					len=fis.read(bytes);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//一次复制一个字节
	public static	void FileCopy1(String srcFileName,String	destFilename)  {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new	FileInputStream(srcFileName);
			fos = new FileOutputStream(destFilename);
			
			int	cc=fis.read();
			//如果cc不是-1,	把cc保存到目标文件中
			while(cc!=-1) {
				fos.write(cc);	//把读到的字节保存到输出流中
				cc=fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(fis!=null ) {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
			if(fos!=null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}
			
		}
			
	}

}
