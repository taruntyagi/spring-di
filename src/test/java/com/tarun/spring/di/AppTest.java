package com.tarun.spring.di;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarun.spring.di.bean.MainWorker_CI;
import com.tarun.spring.di.bean.MainWorker_SI;
import com.tarun.spring.di.bean.annotation.MainWorker_ACI;
import com.tarun.spring.di.bean.annotation.MainWorker_API;
import com.tarun.spring.di.bean.annotation.MainWorker_ASI;

/**
 * Unit test for simple App.
 */
public class AppTest{

	/** The context. */
	private ApplicationContext context = null;
	
	private ApplicationContext autowireContext = null;
	
	private ApplicationContext annotationContext = null;

	/**
	 * Before test.
	 *
	 * @return the suite of tests being tested
	 */
	@Before
	public void beforeTest() {
		context = new ClassPathXmlApplicationContext("bean-config.xml");
		autowireContext = new ClassPathXmlApplicationContext("bean-config-autowiring.xml");
		annotationContext = new ClassPathXmlApplicationContext("bean-config-annotation.xml");
	}

	/**
	 * Rigourous Test :-).
	 */
	public void testConstructorInjection() {
		MainWorker_CI obj = (MainWorker_CI) context.getBean("main-worker-ci");
		Assert.assertEquals("Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Completed work type 2!", obj.doWorkTypeTwo());
	}
	
	public void testSetterInjection() {
		MainWorker_SI obj = (MainWorker_SI) context.getBean("main-worker-si");
		Assert.assertEquals("Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Completed work type 2!", obj.doWorkTypeTwo());
	}
	
	
	public void testBeanAutowiringConstructorConfig() {
		MainWorker_CI obj = (MainWorker_CI) autowireContext.getBean("main-worker-ci");
		Assert.assertEquals("Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Completed work type 2!", obj.doWorkTypeTwo());
	}
	
	
	public void testBeanAutowiringSetterConfig() {
		MainWorker_SI obj = (MainWorker_SI) autowireContext.getBean("main-worker-si");
		Assert.assertEquals("Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Completed work type 2!", obj.doWorkTypeTwo());
	}
	
	@Test
	public void testBeanAnnotationSetterInjection() {
		MainWorker_ASI obj = (MainWorker_ASI) annotationContext.getBean("main-worker-asi");
		Assert.assertEquals("Annotation : Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Annotation : Completed work type 2!", obj.doWorkTypeTwo());
	}

	@Test
	public void testBeanAnnotationPropertyInjection() {
		MainWorker_API obj = (MainWorker_API) annotationContext.getBean("main-worker-api");
		Assert.assertEquals("Annotation : Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Annotation : Completed work type 2!", obj.doWorkTypeTwo());
	}
	
	@Test
	public void testBeanAnnotationConstructorInjection() {
		MainWorker_ACI obj = (MainWorker_ACI) annotationContext.getBean("main-worker-aci");
		Assert.assertEquals("Annotation : Completed work type 1!", obj.doWorkTypeOne());
		Assert.assertEquals("Annotation : Completed work type 2!", obj.doWorkTypeTwo());
	}
}
