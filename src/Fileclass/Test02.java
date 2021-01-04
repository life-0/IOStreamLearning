package Fileclass;

import java.io.File;
import java.io.IOException;

/**
 *	查看文件属性 
 * @author life-1
 * @project_name IOStream
 * @type_name Test02
 * @creation_time 2019年6月19日 下午9:38:17
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		File	f1=new	File("D:\\java.work\\Devil5.mp4");
//		File	f1=new	File("Devil5.mp4"); //相对路径,要求是项目目录下的文件
		f1.createNewFile();//创建文件
		
		System.out.println(f1.getAbsolutePath());//返回绝对路径(从根目录(C,D,E,F盘)开始的路径)
		System.out.println(f1.getPath());	//返回路径
		System.out.println(f1.getParent());	//返回上一级文件夹
		System.out.println(f1.getName());	//对象名 
		System.out.println(f1.length());//文件的大小
		System.out.println(f1.exists());//判断是否存在
		System.out.println(f1.isFile());//判断是否为文件
		System.out.println(f1.isDirectory());//判断是否为文件夹		
		System.out.println(f1.isAbsolute());//判断是否为绝对路径
		System.out.println(f1.lastModified());//查看最后一次修改的时间
	}
}
