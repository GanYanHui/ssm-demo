package cn.jmu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.mapper.StudentsMapper;
import cn.jmu.po.Students;
import cn.jmu.service.StudentsService;

@Service
// @Transactional //������õ�����
public class StudentsServiceImpl implements StudentsService {
	// ע��ע��StudentsMapper
	@Resource(name = "studentsMapper")
	private StudentsMapper studentsMapper;

	// ��ѯѧ����Ϣ
	@Override
	public Students findStuByStudentId(String studentId) {

		return this.studentsMapper.findStuByStudentId(studentId);
	}

}
