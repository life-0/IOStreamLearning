package FileReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 	FileWriter
 * 			��������ʱ��ֻ�ܰ����ݱ��浽GBK����(��ǰ������UTF-8)��ʽ���ļ���
 * @author life-1
 * @project_name IOStream
 * @type_name Writer
 * @creation_time 2019��6��16�� ����9:28:46
 */
public	class	Writer{
		public static void main(String[] args) {
			//1)������ͨ��
			FileWriter fw=null;
			try {
				//����ļ�������,�ᴴ��һ���µ��ļ�������ļ��Ѵ���	�Ḳ��ԭ��������
//				fw = new	FileWriter("D:\\java.work\\IOStream\\src\\xyz.txt");
				//����ļ������ھʹ���,�ļ��Ѵ��ڣ�����׷�ӵ���ʽ��
				fw = new	FileWriter("D:\\java.work\\IOStream\\src\\xyz.txt",true);
				
				//2)���ַ����浽�ļ���
				//һ��дһ���ַ�
				fw.write('A');
				fw.write('��');
				
				//һ�ο���дһ���ַ���
				fw.write("һ�ο���дһ���ַ���");
				//����
				fw.write("\r\n");
				//һ��дһ���ַ�����
				char[]	contents="Hello World�� ��ã����磡".toCharArray();
				fw.write(contents);
				//���ַ�����Ĳ����ַ����浽�ļ���
				
				fw.write(contents,0,5);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} finally {
				if(fw!=null) {
					//�ر���ͨ��
					try {
						fw.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
					
			}
			
			
			
	}
}