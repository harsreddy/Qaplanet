package JXLJar;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excell 
{
	public static void main(String[] args)throws Exception
	{
		WritableWorkbook wwb=Workbook.createWorkbook(new File("D://Flipkart1.xls"));
		WritableSheet ws=wwb.createSheet("Flipkart", 0);
		Label l=new Label(0,0,"PName");
		Label l1=new Label(1,0,"Price");
		Label r1=new Label(0,1,"qaplanet");
		Label r2=new Label(1,1,"admin");
		ws.addCell(l);
		ws.addCell(l1);
		ws.addCell(r1);
		ws.addCell(r2);
		wwb.write();
		wwb.close();
	}
}
