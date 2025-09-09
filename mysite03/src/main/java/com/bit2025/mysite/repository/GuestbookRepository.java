package com.bit2025.mysite.repository;


import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StopWatch;

import com.bit2025.mysite.vo.GuestbookVo;

@Repository
public class GuestbookRepository {
	private static final Log logger = LogFactory.getLog(GuestbookRepository.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<GuestbookVo> findAll()  {
		StopWatch sw = new StopWatch();
		sw.start();
		
		List<GuestbookVo> list = sqlSession.selectList("guestbook.findAll");
		
		sw.stop();
		
		long totalTime = sw.getTotalTimeMillis();
		logger.info(totalTime + "millis");
		
		return list;
		
	}

	public int insert(GuestbookVo vo) {
		return sqlSession.insert("guestbook.insert", vo);
	}
	
	public int deleteByIdAndPassword(Long id, String password) {
		return sqlSession.delete("guestbook.deleteByIdAndPassword", Map.of("id", id, "password", password));
	}
		
	}
	
