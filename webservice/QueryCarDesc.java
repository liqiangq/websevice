package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryCarDesc {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }

    public String[] queryCarDesc(String carid, String time, String sessionId) {
	return getService().queryCaridDesc(carid, time, sessionId);
    }
}
