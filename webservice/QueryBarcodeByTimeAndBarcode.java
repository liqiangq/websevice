package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.IQueryService;

public class QueryBarcodeByTimeAndBarcode {
    private IQueryService service;

    public IQueryService getService() {
	if (service == null) service = (IQueryService) BeanUtil.getBean("webQueryCarService");
	return service;
    }
    public String[] queryBarcodeByTimeAndBarcode(String barcode,String time,String sessionId){
    	return getService().queryBarcodeByTimeAndBarcode(barcode,time, sessionId);
    }
}
