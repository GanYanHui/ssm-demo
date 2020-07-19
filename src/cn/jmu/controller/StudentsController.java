package cn.jmu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Students;
import cn.jmu.service.StudentsService;

@Controller
public class StudentsController {
	// ע��ע��StudentsServiceImpl
	@Resource(name = "studentsServiceImpl")
	private StudentsService studentsService;

	@RequestMapping(value = "/findStuByStudentId.do")
	public String findStuByStudentId(String studentId, Model model) {
		Students stu = this.studentsService.findStuByStudentId(studentId);
		model.addAttribute("students", stu);
		return "stuShow";// ����ѧ����Ϣչʾҳ��
	}
}
