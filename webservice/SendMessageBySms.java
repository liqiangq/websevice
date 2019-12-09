package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.ISendMessageByGprs;

public class SendMessageBySms {
	private ISendMessageByGprs service;

	public ISendMessageByGprs getService() {
		if (service == null)
			service = (ISendMessageByGprs) BeanUtil.getBean("webSendMessageByGprs");
		return service;
	}

	public Boolean sendMessageBySms(String[] phone, String message, String sessionId) {
		boolean flag = getService().sendMessageBySms(phone, message, sessionId);
		return flag;
	}
}
