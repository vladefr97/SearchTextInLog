package test;
import java.io.File;
import java.io.FileFilter;

public class FileSearch {

	public static void main(String[] args) {
		// ����������� ����������
    	File dir = new File(".");
    	// ������ ������� ������ ������ ��������
    	File[] lst1 = dir.listFiles(); 
    	// ������ ������ ������ �������� � ������������ "png" � "jpg"
    	File[] lst2 = dir.listFiles(new Filter("png,jpg"));
    	System.out.println ("lst1.length = " + lst1.length + ", lst2.length = " + lst2.length);

	}

}
