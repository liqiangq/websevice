package com.thtf.ezone.webservice.testcase;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestQueryAllEfence {
    public static void main(String[] args){
    	try{
    		String endpoint = "http://localhost/tms/services/queryAllEfence";
    		Service service = new Service();
    		Call call =  (Call) service.createCall();
    		call.setOperationName(new QName( endpoint , "queryAllEfence"));
    		call.setTargetEndpointAddress (new java.net.URL(endpoint));
    	
    		String sessionId = "sessionid1251690355";
    		String[] ret = (String[]) call.invoke(new Object[] {sessionId} );
    		if (ret != null){
    			if (ret.length == 0)
    				printLog("未取到符合条件的记录");
            for(int i=0;i<ret.length;i++){
            	printLog(i+" - "+ret[i]);
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
