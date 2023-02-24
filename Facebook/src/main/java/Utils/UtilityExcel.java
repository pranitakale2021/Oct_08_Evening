package Utils;

import java.io.FileInputStream;

public class UtilityExcel {
	 public static String fetchData from ExcelSheet(String sheet,int row,int column)
	 
	 String Path="C:\\Users\\admin\\OneDrive\\Desktop\\Report.xlsx";
	 
	 FileInputStream file= new FileInputStream(Path);
	 String value =WorkbookFactory.create(file).getSheet("sheet").getRow(3).getCell(2).getStringCellValue();
     System.out.println(value);
      returnsData;
}
