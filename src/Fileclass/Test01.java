package Fileclass;

import java.io.File;
import java.io.IOException;

/**
 *	????File???? 
 * @author life-1
 * @project_name IOStream
 * @type_name Test01
 * @creation_time 2019??6??19?? ????9:28:05
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		File	f1=new	File("D:\\java.work\\IOStream\\File01Built");
		f1.mkdir();	//?????????
		
		File	f2=new	File("D:\\java.work\\IOStream\\File01Built\\File02Built");
		f2.mkdir();
		 
		File	f3=new	File("D:/java.work/IOStream/File01Built","File03Built");
		f3.createNewFile();	//???????
		
		File	f4=new	File(f2,"File04Built");
		f4.createNewFile();	//
	}
}
