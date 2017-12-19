package com.zheng.hospital.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class ZhengHospitalRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ZhengHospitalRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> zheng-hospital-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		LOGGER.info(">>>>> zheng-hospital-rpc-service 启动完成 <<<<<");
	}

}
