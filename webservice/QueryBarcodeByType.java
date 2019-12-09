package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryBarcodeByType {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }
    public String[] queryBarcodeByType(String barcode,String sessionId){
    	return getService().queryBarcodeByType(barcode, sessionId);
    }
}
