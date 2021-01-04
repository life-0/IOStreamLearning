package FileReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 	FileWriter
 * 			保存数据时，只能把数据保存到GBK编码(当前环境是UTF-8)格式的文件中
 * @author life-1
 * @project_name IOStream
 * @type_name Writer
 * @creation_time 2019年6月16日 下午9:28:46
 */
public	class	Writer{
		public static void main(String[] args) {
			//1)建立流通道
			FileWriter fw=null;
			try {
				//如果文件不存在,会创建一个新的文件，如果文件已存在	会覆盖原来的内容
//				fw = new	FileWriter("D:\\java.work\\IOStream\\src\\xyz.txt");
				//如果文件不存在就创建,文件已存在，就以追加的形式打开
				fw = new	FileWriter("D:\\java.work\\IOStream\\src\\xyz.txt",true);
				
				//2)把字符保存到文件中
				//一次写一个字符
				fw.write('A');
				fw.write('汉');
				
				//一次可以写一个字符串
				fw.write("一次可以写一个字符串");
				//换行
				fw.write("\r\n");
				//一次写一个字符数组
				char[]	contents="Hello World！ 你好，世界！".toCharArray();
				fw.write(contents);
				//把字符数组的部分字符保存到文件中
				
				fw.write(contents,0,5);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} finally {
				if(fw!=null) {
					//关闭流通道
					try {
						fw.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
					
			}
			
			
			
	}
}