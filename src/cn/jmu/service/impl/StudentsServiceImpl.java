package cn.jmu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.mapper.StudentsMapper;
import cn.jmu.po.Students;
import cn.jmu.service.StudentsService;

@Service
// @Transactional //如果有用到事务
public class StudentsServiceImpl implements StudentsService {
	// 注解注入StudentsMapper
	@Resource(name = "studentsMapper")
	private StudentsMapper studentsMapper;

	// 查询学生信息
	@Override
	public Students findStuByStudentId(String studentId) {

		return this.studentsMapper.findStuByStudentId(studentId);
	}

}
