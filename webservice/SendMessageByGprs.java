package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.ISendMessageByGprs;

public class SendMessageByGprs {

	private ISendMessageByGprs service;

	public ISendMessageByGprs getService() {
		if (service == null)
			service = (ISendMessageByGprs) BeanUtil.getBean("webSendMessageByGprs");
		return service;
	}

	public void sendMessageByGprs(String carid, String message, String sessionId) {
		getService().sendMessage(carid, message, sessionId);
	}
}
