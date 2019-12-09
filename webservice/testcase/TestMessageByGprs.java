package com.thtf.ezone.webservice.testcase;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestMessageByGprs {
	public static void main(String[] args) {
		try {
			String endpoint = "http://localhost/tms/services/sendMessageByGprs";
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setOperationName(new QName(endpoint, "sendMessageByGprs"));
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			String carId = "皖H00108";
			String content = "你好,车机信息测试";
			String sessionId = "sessionid457853071";
			Boolean ret = (Boolean) call.invoke(new Object[] { carId, content,sessionId });
		if (ret!=null && ret.booleanValue())
				printLog("发送成功");
			else
				printLog("发送失败");
		} catch (Exception e) {
			e.printStackTrace();
			printLog(e.toString());
		}

	}
	private static void printLog(String message){
    	System.out.println(message);
    }
}
