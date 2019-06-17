package com.yl.user.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yl.user.utils.UserVO;

public interface TblUserDao extends BaseMapper<UserVO>{
	UserVO selectById(UserVO vo);
	
}
