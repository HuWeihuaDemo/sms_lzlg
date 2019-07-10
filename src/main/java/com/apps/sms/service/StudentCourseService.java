package com.apps.sms.service;

		import java.util.List;
		import com.apps.sms.bean.StudentCourse;
		public interface StudentCourseService {

			List<StudentCourse>selectAll();

			void saveOrUpdate(StudentCourse studentcourse) throws Exception;
		}
