package example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bean2;
import can.Service.PersonService;
import can.Service.impl.PersonServiceBean;

public class TestIOC {
	@Test
	public void testUser(){
		//����spring�����ļ�
		ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
		//�õ�������Ķ���
		//Bean2 b=(Bean2) context.getBean("bean2");
		//b.add();
		PersonServiceBean psb=(PersonServiceBean) context.getBean("personService");
		PersonService ps=(PersonService) context.getBean("setnlist");
		for(String value:ps.getSets()){
			System.out.println(value);
		}
		for(String value:ps.getLists()){
			System.out.println(value);
		}
		for(Object key:ps.getProperties().keySet()){
			System.out.println(key);
			System.out.println(ps.getProperties().getProperty((String)key));
		}
		for(Object key:ps.getMaps().keySet()){
			System.out.println(key);
			System.out.println(ps.getMaps().get(key));
		}
		psb.save();
	}

}
