package utilities;

import java.util.List;
import java.util.Map;

public class TestDataProvider {
	

	    public static List<Map<String,String>> getLoginData(){

	        return ExcelReader.getData("login");
	    }
	}

