package part5;
/*
 * __Stream : byte 단위
 * __Reader : char 단위
 */


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in; //중간에 buffer라는 필터를 끼운거
//		int a = is.read();
//		System.out.println((char)a + " " + a);
		
//	String(buffer로 고쳐서 단어로 나오게) <-//2byte(한글이나오게:reader)<-	1byte
//		InputStreamReader isr = new InputStreamReader(System.in);
//		int a = isr.read();
//		System.out.println(a + " " + (char)a);
		
		//bufferTest();으로 메소드 불러온다
		//dateType filter(보조스트림)
//		dataOutput(); //stream -> byte
//		dateInput();
		
//		writerTest();
//		readerTest();
		
//		textFileCopy();
		
		streamfileCopy(); //fileinputstream, fileoutstream
		
	}
	public static void streamfileCopy() throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File("17097904_666640573538171_7061376068836512469_o.jpg")));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(new File("윤계상1.jpg")));
		
//		buffer 아닐때
//		int b;
//		while((b = fis.read()) != -1 ) {
//			fos.write(b);
//		}
		
//		이클립스에서 열린다.
//		잘기억하기!!!!!
		int size;
		byte[] b = new byte[1000];
		while((size = fis.read(b)) != -1 ) {
			fos.write(b,0,size);
		}
		fis.close();
		fos.close();
	}
	
	//memo를 읽어서 memo_copy를 만든다.
	public static void textFileCopy() throws IOException {
		FileReader fr = new FileReader(new File("memo.txt"));
		BufferedReader br = new BufferedReader(fr); 
		
		FileWriter fw = new FileWriter(new File("memo_copy.txt"));
		BufferedWriter bw = new BufferedWriter(fw); //속도
		
		String s1;
		while((s1 = br.readLine()) != null ) {
			bw.write(s1+ "\n"); //복사해서 넣는다.
		}
		br.close();
		bw.close();
		
	}
	public static void writerTest() throws IOException {
//		BufferedWriter fw = new BufferedWriter(new FileWriter(new File("memo.txt"))); //byte 단위 아니고 char 단위
		FileWriter fw = new FileWriter(new File("memo.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello\n");
		bw.write("everybody\n");
		bw.write("123");
		bw.close();
	}
	
	public static void readerTest() throws IOException {
		FileReader fr = new FileReader(new File("memo.txt"));
		BufferedReader br = new BufferedReader(fr); //buffer 없으면 한글자밖에 못 읽는다.
//		String s1 = br.readLine();
//		String s2 = br.readLine();
//		for문 돌려서 읽어오기
		String s1;
		while((s1 = br.readLine()) != null ) {
			System.out.println(s1);
		}
		br.close();
	}
	
	
	public static void dataOutput() throws IOException { //byte 타입이라서 b.txt 못읽음.
//		123 -> 1 2 3
		DataOutputStream fos = new DataOutputStream(new FileOutputStream(new File("b.txt")));
		fos.writeInt(100);
		fos.writeDouble(95.5);
		fos.close();
	}
	
	public static void dateInput() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream(new File("b.txt")));
		int score = dis.readInt();
		double avg = dis.readDouble();
		System.out.println(score + " : " + avg);
	}
	
	
	public static void bufferTest() throws IOException {
		//buffer를 거치면 문자열로 고쳐준다.
		BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
		String a = isr.readLine();
		System.out.println(a);
		
	}

}
