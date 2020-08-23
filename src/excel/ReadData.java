package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
	@Test
	public void readData() throws IOException 
	{
      FileInputStream fis=new FileInputStream("H:\\automation related software\\Book1.xlsx");
      XSSFWorkbook wb=new XSSFWorkbook(fis);
     /* Sheet s=wb.getSheet("navin");
      Row r=s.getRow(6);
      Cell c= r.getCell(4);
      System.out.println(c.getStringCellValue());*/
      System.out.println(wb.getSheet("navin").getRow(6).getCell(4).getStringCellValue());
    }
}