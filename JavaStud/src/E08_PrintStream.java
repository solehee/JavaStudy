import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class E08_PrintStream {
	
	/*
		# PrintWriter, PrintStream
		
		- ��� �����͵��� �� ���ϰ� ��Ʈ������ ������ �� �ִ� Ŭ����
		- printf(), println()���� �޼������ �����Ǿ� �ִ� 
	 
	 
	*/
	
	public static void main(String[] args) {
		File f = new File("files/myfile.txt");
		try(
				// �Ʒ� �����̸� try���� File f = new File�� ����� �ʿ� ����
				//MyFile f = new MyFile("files/myfile.txt");
			FileOutputStream fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			PrintStream out = new PrintStream(bout);
		){
			//f.out.println("Hello, world!");
			//f.out.println(" /)/)");
			//f.out.println("(.. )");
			//f.out.println(" ��< )");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ��");
	}
}

class MyFile extends File implements AutoCloseable{
	
	// OutputStream ���� ���ڸ� �������� ����
	FileOutputStream fout;
	BufferedOutputStream bout;
	PrintStream out; 
	
	public MyFile(String pathname) throws FileNotFoundException {
		super(pathname);
		fout = new FileOutputStream(this);
		bout = new BufferedOutputStream(fout);
		out = new PrintStream(bout, true,Charset.forName("UTF-8"));
	}

	@Override
	public void close() throws Exception {
		out.close();
		bout.close();
		fout.close();
	}
	
}
