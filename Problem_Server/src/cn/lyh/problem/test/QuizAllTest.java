package cn.lyh.problem.test;

import cn.lyh.problem.db.DB;

public class QuizAllTest {

	public static void main(String[] args) {
		DB db = DB.getDB();
		int pid = 6;
		int page = 1;
		
		System.out.println(db.pidQuizAll(pid, page));

	}

}
