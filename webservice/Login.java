package com.thtf.ezone.webservice;

import com.thtf.ezone.security.util.BeanUtil;
import com.thtf.ezone.server.ILoginService;

public class Login {
    private ILoginService service;

    public ILoginService getService() {
	if (service == null) service = (ILoginService) BeanUtil.getBean("webLoginService");
	return service;
    }

    public String login(String name, String password) {
	System.out.println("----start----login----");
	return getService().login(name, password);
    }
}
