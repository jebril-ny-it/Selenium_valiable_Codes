package hashmaps;

import java.util.HashMap;

public class TestData {

	
	public static HashMap<String, String> grtUserLoginInfo() {
		
		HashMap<String ,String> usermap = new HashMap<String,String>();
		usermap.put("customer", "mjebril1990@gmail.com_Mohammad1226");
		usermap.put("naveen", "naveenk_test@123");
		
		return usermap;
	}

	public static void monthMap() {
		HashMap<Integer, String> monthMap = new HashMap<Integer,String>();
		monthMap.put(1, "January");
		monthMap.put(2, "Februry");
		monthMap.put(3, "March");
		monthMap.put(4, "April");
		monthMap.put(5, "MAy");
		monthMap.put(6, "June");
		monthMap.put(7, "July");
		monthMap.put(8, "August");
		monthMap.put(9, "September");
		monthMap.put(10, "October");
		monthMap.put(11, "Novemeber");
		monthMap.put(12, "December");

		
	}


}
