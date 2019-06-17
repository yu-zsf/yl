package com.yl.user.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.yl.user.utils.PageVO;
import com.yl.user.utils.UserVO;

public interface ITblUserService extends IService<UserVO>{

	UserVO queryUserList(UserVO vo);
//	/**
//	 * 查询所有用户
//	 * @param vo
//	 * @return
//	 */
//	PageVO<UserVO> queryAllUser(UserVO vo);
}
