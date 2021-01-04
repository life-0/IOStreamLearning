package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;


/**
 *	�ַ�������
 *	BufferedReader/BufferedWriter
 *	 Ҳ��һ�ִ�����,��װ��  
 * @author life-1
 * @project_name IOStream
 * @type_name CopyFile04
 * @creation_time 2019��6��17�� ����8:31:17
 */
public class CopyFile04 {
	public static void main(String[] args) throws IOException {
//		m1();	//ʹ��BufferedReader��ȡ�ı��ļ�����
		m2();	//ʹ��BufferedWriter�����ı����ļ���
		m3();	//�Ӽ����������ı�,����Щ�ı����浽�ļ���
	}

	private static void m3() throws IOException {
		BufferedWriter	bw=new	BufferedWriter(new	FileWriter("D:\\java.work\\IOStream\\src\\BUFFERED.txt"));
		//ʹ��BufferedReader�Լ�������������
		//System.in�Ǳ�׼�������豸,������
		BufferedReader	br=new	BufferedReader(new	InputStreamReader(System.in));
		
		String	line=br.readLine();
		while(line.length()>0) {
			bw.write(line);//����һ��
			bw.newLine();//�´���һ��
			line=br.readLine();
			
		}
		
		br.close();
		bw.close();
		
	}

	private static void m2() throws IOException {
		Writer	out=new	FileWriter("D:\\java.work\\IOStream\\src\\BUFFERED.txt",true);
		BufferedWriter	bw=new	BufferedWriter(out);
		
		bw.write("23333333\r\n");
		bw.write("ľ��ľ��ľ��ľ��ľ��ľ��ľ");
		
//		bw.flush();//��ջ�����,�����ݱ��浽�ļ���
		bw.close();
		
	}

	private static void m1() throws IOException {
		Reader	in=new	FileReader("D:\\java.work\\IOStream\\src\\Writer.java");
		BufferedReader	br=new	BufferedReader(in);
		
		//�ӻ����ַ����ж�ȡһ��,�����ļ�ĩβ����null
		String	line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();//�Ѱ�װ���رպ�,����װ����Ҳ��ر�
	}
}
