package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryAllCar {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }

    public String[] queryAllCar(String sessionId) {
	return getService().queryAllCar(sessionId);
    }
}
