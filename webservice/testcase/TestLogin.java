package com.thtf.ezone.webservice.testcase;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestLogin {
	public static void main(String[] args) {
		try {
			String endpoint = "http://localhost/tms/services/login";
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTimeout(-1);
			call.setOperationName(new QName(endpoint, "login"));
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			String ret = (String) call.invoke(new Object[] { "admin01", "123456" });
			printLog("登录成功,会话ID:" + ret);
		} catch (Exception e) {
			printLog("登录失败,请检查用户名,密码是否正确");
			printLog(e.toString());
		}

	}
	private static void printLog(String message){
    	System.out.println(message);
    }
}
