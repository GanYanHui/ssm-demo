package cn.jmu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jmu.po.Students;
import cn.jmu.service.StudentsService;

public class StudentsTest {
	@Test
	public void findStuByStudentId() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		StudentsService studentsService = (StudentsService) app.getBean("studentsServiceImpl");
		Students stu = studentsService.findStuByStudentId("2017130173");
		System.out.println(stu);
	}
}
