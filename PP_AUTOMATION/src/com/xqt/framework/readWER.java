package com.xqt.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readWER {


		
public static String getElementFromWER (String logicalName,String propfilepath) throws IOException {
				
String ratval=null;

FileInputStream fis=new FileInputStream(propfilepath);

Properties prop=new Properties();
prop.load(fis);

ratval=prop.getProperty(logicalName);
			
return ratval;			
			
}
}
