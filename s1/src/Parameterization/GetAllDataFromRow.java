package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromRow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\PARAMETERIZATION\\Book1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	short lcell = sh.getRow(0).getLastCellNum();
	
	for(int i=0;i<=lcell-1;i++) {
		String all = sh.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(all+"  ");
	}
	
	
	
	
	
	
	
	
	
	
}
}
