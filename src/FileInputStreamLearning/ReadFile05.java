package FileInputStreamLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 	�쳣����
 * @author life-1
 * @project_name IOStream
 * @type_name ReadFile05
 * @creation_time 2019��6��13�� ����10:46:57
 */
public class ReadFile05 {

	public static void main(String[] args) {
		m1();//һ�ζ�ȡһ���ֽ�,�ֶ��ر���,�쳣����
		m2();//���ļ��ж�ȡ�ֽڱ��浽�ֽ�������,�쳣����,��ʵ���Զ��ر�
		
	}
	
	private static void m2() {
		// TODO �Զ����ɵķ������
		//��JDK7��ʼ,�������Զ��ر�
		try (	//try��Դ��,�Զ��ͷ�
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(fis!=null) {//���fisΪnull�Ļ����޷��ر���,����ֿ�ָ���쳣�������ж�
				try {
					fis.close();
					System.out.println();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}//�ر���,�ͷ�ϵͳ��Դ				
			}
		}
	}

}
