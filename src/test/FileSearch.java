package test;
import java.io.File;
import java.io.FileFilter;

public class FileSearch {

	public static void main(String[] args) {
		// Определение директории
    	File dir = new File(".");
    	// Чтение полного списка файлов каталога
    	File[] lst1 = dir.listFiles(); 
    	// Чтение списка файлов каталога с расширениями "png" и "jpg"
    	File[] lst2 = dir.listFiles(new Filter("png,jpg"));
    	System.out.println ("lst1.length = " + lst1.length + ", lst2.length = " + lst2.length);

	}

}
