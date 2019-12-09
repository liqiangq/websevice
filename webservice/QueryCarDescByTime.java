package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryCarDescByTime {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }

    public String[] queryCarDescByTime(String carid, String beginTime, String endTime, String sessionId) {
	return getService().queryCaridDescByTime(carid, beginTime, endTime, sessionId);
    }
}
