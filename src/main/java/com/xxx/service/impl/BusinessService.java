package com.xxx.service.impl;

import javax.jws.WebService;

import com.xxx.service.BaseService;
@WebService(endpointInterface="com.xxx.service.BaseService")
public class BusinessService implements BaseService {

    @Override
    public int add(int a, int b) {
	return a+b;
    }

    @Override
    public String sayHello(String name) {
	return "hello,"+name;
    }

}
