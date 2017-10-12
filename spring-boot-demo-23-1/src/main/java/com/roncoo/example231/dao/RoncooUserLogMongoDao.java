package com.roncoo.example231.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.roncoo.example231.bean.RoncooUserLog;

public interface RoncooUserLogMongoDao extends MongoRepository<RoncooUserLog, Integer>{

	RoncooUserLog findByUserName(String string);
	
	RoncooUserLog findByUserNameAndUserIp(String string, String ip);

	Page<RoncooUserLog> findByUserName(String string, Pageable pageable);
}
