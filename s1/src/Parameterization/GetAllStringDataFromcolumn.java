package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllStringDataFromcolumn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\PARAMETERIZATION\\Book1.xlsx");
	
    Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
    
    int lrow = sh.getLastRowNum();
    
    for(int i=0;i<=lrow;i++) {
    	String rt = sh.getRow(i).getCell(0).getStringCellValue();
    	
    	System.out.println(rt);
    }
    
	
	
	
	
	
	
	
	
}
}
