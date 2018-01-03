package WebDriverEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex {

	public static void main(String[] args) {
		Date dt=new Date();
		SimpleDateFormat da=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		
	
		
		String d=da.format(dt);
		System.out.println(d);
//		Timestamp time=new Timestamp(System.currentTimeMillis());
//		Date d=new Date(time.getTime());
//		System.out.println(d);
	}
	
}
