package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class E03_Copy {
	/*
	 	# image ���� ������ ��� ������ image_copy ���� ���η� �����غ�����
	 		EASY :  �׳� ���۸� �ϸ� ����
	 		HARD: ���߿� ���� ������ ���� �̸��� ���ϴ��� �ùٸ��� �����ϸ� ����
	*/
	public static void main(String[] args) throws IOException {
	
	 File src = new File("image");
	 File dst = new File("image_copy");
	 
	 if(!dst.exists()) {
		 dst.mkdir();
	 }
	 
	 File[] src_files = src.listFiles();
	 for(File file : src_files) {
		 System.out.println(file);
		 System.out.println("���丮 ����: "+(file.isDirectory()? "Y" : "N"));
		 System.out.println("-------------");
		 
		 if(file.isDirectory()) {
			 System.out.println("Dir to create: "+file.getName());
			 File new_dir = new File(dst,file.getName());
			 new_dir.mkdirs();
			 
			 File[] inner_files = file.listFiles();
			 for(File file2 : inner_files) {
				 System.out.println(file2);
				 System.out.println("���丮 ����: "+(file2.isDirectory()? "Y" : "N"));
				 System.out.println("-------------");
			
				 if(!file2.isDirectory()) {
					 FileInputStream in = new FileInputStream(file2);
						FileOutputStream out = new FileOutputStream(
								new File(new_dir,file2.getName()));
						
						byte[] buffer = new byte[2048];

						int len = -1;
						while((len=in.read(buffer))!=-1) {
							out.write(Arrays.copyOf(buffer, len));
						}
				 }
			 }
		 }else {
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream(
					new File(dst,file.getName()));
			
			
			//int _byte = -1;
			//while((_byte = in.read())!=-1) {
			//	out.write(_byte);
			//}
			
			byte[] buffer = new byte[2048];

			int len = -1;
			while((len=in.read(buffer))!=-1) {
				byte[] to_write = new byte[len];
				
				for(int i=0; i<len;++i) {
					to_write[i] = buffer[i];
				}
				out.write(to_write);
			//	out.write(Arrays.copyOf(buffer, len));
			}
			
			out.close();
			in.close();
		 }
		 
	 }
	 
	 System.out.println("���簡 ��� �������ϴ�.");
	/*String name="";	
	File image = new File("image");
	
	String f[] = image.list();
	for(int i=0;i<f.length;++i) {
		name = f[i];
	}
	
	
	File copy = new File("image_copy");
	File copy_file = new File(copy,name);
	
		copy.mkdirs();
		copy_file.mkdir();
		
		// ���������̸�
		if(copy_file.isDirectory()) {
			File image_file = new File(image,name);
			File f2[] = image_file.listFiles();
			
			for(int i=0;i<f2.length;i++) {
				System.out.println(f2[i]);
				
				//���ϳ��� �о���̱�
				try {
					FileInputStream in = new FileInputStream(f2[i]);

					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	*/
	}
}
