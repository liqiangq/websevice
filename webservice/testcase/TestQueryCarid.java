package com.thtf.ezone.webservice.testcase;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestQueryCarid {
    public static void main(String[] args){
    	try{
    		
    		String endpoint = "http://localhost/tms/services/queryCarDesc";
    		Service service = new Service();
    		Call call =  (Call) service.createCall();
    		call.setOperationName(new QName( endpoint , "queryCarDesc"));
    		call.setTargetEndpointAddress (new java.net.URL(endpoint));
    		String carId = "鲁A33373";
    		String time = "";
    		String sessionId = "sessionid-69225610";
    		String[] ret = (String[]) call.invoke(new Object[] {carId,time ,sessionId} );
    		if (ret != null){
    			if (ret.length == 0)
    				printLog("未取到符合条件的记录");
            for(int i=0;i<ret.length;i++){
            	if(ret[i]!=null){
            		System.out.println(i+" - "+ret[i]);
            	}
            	
            }
    		}
    		else{
    			printLog("用户未登录或者登录会话过期,请重新登录");
    		}
    			
    	}
    	catch(Exception e){
    	    e.printStackTrace();
    	}
    }
    
    private static void printLog(String message){
    	System.out.println(message);
    }
}
