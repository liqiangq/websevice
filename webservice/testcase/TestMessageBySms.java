package com.thtf.ezone.webservice.testcase;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestMessageBySms {
	public static void main(String[] args) {
		try {
			String endpoint = "http://localhost/tms/services/sendMessageBySms";
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setOperationName(new QName(endpoint, "sendMessageBySms"));
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			String phone[] = new String[]{"13717791178","13611370282","13801105253"};
			String content = "你好,短信测试";
			String sessionId = "sessionid1251690355";
			Boolean ret = (Boolean) call.invoke(new Object[] { phone, content,sessionId });
			if (ret!=null && ret.booleanValue())
				printLog("发送成功");
			else
				printLog("发送失败");
		} catch (Exception e) {
			printLog(e.toString());
		}

	}
	private static void printLog(String message){
    	System.out.println(message);
    }
}
