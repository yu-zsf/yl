package com.yl.user.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yl.user.dao.TblUserDao;
import com.yl.user.service.ITblUserService;
import com.yl.user.utils.PageVO;
import com.yl.user.utils.UserVO;


@Service
public class TblUserServiceImpl extends ServiceImpl<TblUserDao, UserVO> implements ITblUserService{


	@Override
	public UserVO queryUserList(UserVO vo) {
		return baseMapper.selectById(vo);
	}
	

}
