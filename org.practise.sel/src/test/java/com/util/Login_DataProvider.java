package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login_DataProvider {

	public static Object[][] readLogin_Data() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\svina\\git\\Selenium_Practise\\org.practise.sel\\src\\test\\resources\\LoginData.xlsx"));
       XSSFWorkbook workbook= new XSSFWorkbook(fis);
       XSSFSheet sheet= workbook.getSheet("Sheet1");
       int Row_No=sheet.getLastRowNum();
       int Col_No=sheet.getRow(0).getLastCellNum();
       
       Object[][] login_data= new Object[4][2];
       for(int i=0;i<Row_No;i++)
       { 
    	  //Object[] listString=  new Object[Col_No];
    	   for(int j=0;j<Col_No;j++)
    	   {
    		   
    		   login_data[i][j] = (sheet.getRow(i+1).getCell(j).getStringCellValue());
    	   }
    	   
       }
       
       
       
              
       workbook.close();
       fis.close();
       return login_data;
		
	}
	public static Iterator<Object[]> readIterator() throws Exception
	{
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\svina\\git\\Selenium_Practise\\org.practise.sel\\src\\test\\resources\\LoginData.xlsx"));
	       XSSFWorkbook workbook= new XSSFWorkbook(fis);
	       XSSFSheet sheet= workbook.getSheet("Sheet1");
	       int Row_No=sheet.getLastRowNum();
	       int Col_No=sheet.getRow(0).getLastCellNum();
	       List<Object[]> login_data=new ArrayList<Object[]>();
	       for(int i=0;i<Row_No;i++)
	       { 
	    	   Object[] a=new Object[Col_No];
	    	   
	    	   for(int j=0;j<Col_No;j++)
	    	   {
	    		   
	    		   a[j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	    	   }
	    	   login_data.add(a);
	    	   
	       }
	   /**   Iterator<Object[]> i=login_data.iterator();
	      while(i.hasNext())
	      {
	    	Object[] j=i.next();
             for(int k=0;k<j.length;k++)
             {
            	 System.out.print(j[k]);
             }
             System.out.println();

	    	  
	      }  */

	       workbook.close();
	       fis.close();
	       return login_data.iterator();

		
	}

}
