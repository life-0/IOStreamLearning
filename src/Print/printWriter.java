package Print;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *	Printwriter
 *		���ַ�Ϊ��λ�Ĵ�ӡ�� 
 * @author life-1
 * @project_name IOStream
 * @type_name printWriter
 * @creation_time 2019��6��19�� ����8:56:07
 */
public class printWriter {
	public static void main(String[] args) throws IOException {
		PrintWriter	pw=new	PrintWriter(new	FileWriter("D:\\java.work\\IOStream\\scourse\\def.txt"));
		pw.print("�����ַ���ӡ��");
		pw.println();
		try {
			FileInputStream	fis=new	FileInputStream("F:sadha.txt");//�ļ�������
		} catch (Exception e) {
			e.printStackTrace(pw);
		}
		pw.close();
	}
}
