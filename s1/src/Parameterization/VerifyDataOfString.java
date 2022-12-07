package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyDataOfString {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\123\\OneDrive\\Desktop\\SOFTWARE TESTING\\PARAMETERIZATION\\Book1.xlsx");

    CellType Type = WorkbookFactory.create(file).getSheet("sheet1").getRow(10).getCell(6).getCellType();

    System.out.println(Type);




















}
}
