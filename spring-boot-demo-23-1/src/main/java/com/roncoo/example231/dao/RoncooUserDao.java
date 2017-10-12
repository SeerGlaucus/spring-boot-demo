package com.roncoo.example231.dao;

import com.roncoo.example231.bean.RoncooUser;
import com.roncoo.example231.util.base.Page;

public interface RoncooUserDao {

	int insert(RoncooUser roncooUser);

	int deleteById(int id);

	int updateById(RoncooUser roncooUser);

	RoncooUser selectById(int id);

	Page<RoncooUser> queryForPage(int i, int j, String string);

}
