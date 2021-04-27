package hrm.utility.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation 
{
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	public static void setExcelFile(String FilePath)
	{
		try 
		{
			FileInputStream fileIn=new FileInputStream(FilePath);
			book=new XSSFWorkbook(fileIn);
			sheet=book.getSheet("Sheet1");
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		} 
	}
	
	public static String getExcelData(String FilePath,int rowNum,int cellNum)
	{
		setExcelFile(FilePath);
		String excelData=null;
		row=sheet.getRow(rowNum);
		if(row==null)
		{
			row=sheet.createRow(rowNum);
		}
		if(row.getCell(cellNum)!=null)
		{
			cell=row.getCell(cellNum);
			//cell.setCellType(CellType.STRING);
			String data=cell.getStringCellValue();
			excelData=data;
		}
		else
		{
			String cell=(row.getCell(cellNum)+"").toString();
			excelData=cell;
		}
		return excelData;
	}
	
	public static void setExcelData(String FilePath,int rowNum,int cellNum,String data)
	{
		setExcelFile(FilePath);
		row=sheet.getRow(rowNum);
		if(row==null)
		{
			row=sheet.createRow(rowNum);
		}
		if(row.getCell(cellNum)!=null)
		{
			cell=row.getCell(cellNum);
			cell.setCellValue(data);
		}
		else
		{
			cell=row.createCell(cellNum);
			cell.setCellValue(data);
		}		
		try 
		{
			FileOutputStream fileOut=new FileOutputStream(FilePath);
			book.write(fileOut);			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
}
