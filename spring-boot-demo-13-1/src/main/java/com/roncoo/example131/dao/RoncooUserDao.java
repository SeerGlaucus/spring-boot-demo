package com.roncoo.example131.dao;

import com.roncoo.example131.bean.RoncooUser;
import com.roncoo.example131.util.base.Page;

public interface RoncooUserDao {

	int insert(RoncooUser roncooUser);

	int deleteById(int id);

	int updateById(RoncooUser roncooUser);

	RoncooUser selectById(int id);

	Page<RoncooUser> queryForPage(int i, int j, String string);

}
