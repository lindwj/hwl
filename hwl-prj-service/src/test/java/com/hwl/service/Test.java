package com.hwl.service;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.hwl.service.dao.SdElectResAccMapper;
import com.hwl.service.util.Common;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:web.xml"})
public class Test {

	@Before
    public void init() {
        //在运行测试之前的业务代码
    }
    @After
    public void after() {
        //在测试完成之后的业务代码
    }
    @Autowired
	private RecoveryService recoveryService;
	 @org.junit.Test
	    public void test() {
		 recoveryService.recovery("D:/ziptest/", "D:/ziptarget/", "佛山甬大电梯部件有限公司(2016).zip",1);
	}
}
