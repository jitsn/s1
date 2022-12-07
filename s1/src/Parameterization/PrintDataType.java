package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataType {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\PARAMETERIZATION\\Book1.xlsx");

     Cell cellinfo = WorkbookFactory.create(file).getSheet("sheet1").getRow(10).getCell(6);
    
    CellType type = cellinfo.getCellType();

    if(type==CellType.STRING) {
    	System.out.println(cellinfo.getStringCellValue());
    }
    else if(type==CellType.BOOLEAN) {
    	System.out.println(cellinfo.getBooleanCellValue());
    }
    else if(type==CellType.NUMERIC) {
    	System.out.println(cellinfo.getNumericCellValue());
    }








}
}
