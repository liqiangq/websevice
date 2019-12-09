package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryBarcodeBySendTime {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }
    public String[] queryBarcodeBySendTime(String time,String sessionId){
    	return getService().queryBarcodeBySendTime(time, sessionId);
    }
}
