package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataRowAndColumn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file=new FileInputStream("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\PARAMETERIZATION\\Book1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	for(int i=0;i<=sh.getLastRowNum();i++) {
		
		for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
			
			String all = sh.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(all+"  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
