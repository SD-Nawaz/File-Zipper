package zip;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipTest {
	public static void main(String[] args) {
		zipTest.zip_one_file();
	}
	
	public static void zip_one_file() {
    	byte[] buffer = new byte[1024];
    	
    	try{
	    	FileOutputStream fos = new FileOutputStream("D:\\java\\zipeerfile1\\Introduction to DSA..zip");
	        ZipOutputStream zos = new ZipOutputStream(fos);
	    	ZipEntry ze= new ZipEntry("testingStudy1.txt");
	    	zos.putNextEntry(ze);
	    	FileInputStream in = new FileInputStream("D:\\java\\zipeerfile1\\Introduction to DSA.pdf");
	    	int len;
	    	while ((len = in.read(buffer)) > 0) {
	    		zos.write(buffer, 0, len);
	    	}
	    	in.close();
	    	zos.closeEntry();
	    	//remember close it
	    	zos.close();
	    	System.out.println("Done");
    	}catch(IOException ex){
    		ex.printStackTrace();
    	}
	}
}
