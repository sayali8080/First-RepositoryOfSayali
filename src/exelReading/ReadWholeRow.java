package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeRow
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		//how to read whole row from excel
		
		File myFile=new File("G:\\Selenium\\PracticeExcelSheet.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		for(int i=1;i<=5;i++)
		{
			String value1 = mySheet.getRow(5).getCell(i).getStringCellValue();
			System.out.println(value1+"");
		}
		System.out.println();
		
		
	}

}
