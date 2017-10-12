package com.roncoo.example161.dao;

import com.roncoo.example161.bean.RoncooUser;
import com.roncoo.example161.util.base.Page;

public interface RoncooUserDao {

	int insert(RoncooUser roncooUser);

	int deleteById(int id);

	int updateById(RoncooUser roncooUser);

	RoncooUser selectById(int id);

	Page<RoncooUser> queryForPage(int i, int j, String string);

}
