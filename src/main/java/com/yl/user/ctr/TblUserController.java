package com.yl.user.ctr;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yl.user.service.ITblUserService;
import com.yl.user.utils.PageVO;
import com.yl.user.utils.PaginationVO;
import com.yl.user.utils.UserVO;

@RestController
public class TblUserController {
	
	@Autowired
	private ITblUserService tblUserService;	
	
	@PostMapping("/user/queryUserList")
	public UserVO queryUserList(@RequestBody UserVO vo){
		UserVO user=tblUserService.queryUserList(vo);
		return user;
		
	}
	
	@PostMapping("/user/queryUser")
	public UserVO queryUser(@RequestBody UserVO vo){
		return tblUserService.getById(vo);
	}
	
	/**
	 * 不分页查询所有
	 * @return
	 */
	@PostMapping("/user/queryAllUser")
	public PageVO<UserVO> queryAllUser(){
		UserVO entity=new UserVO();
		QueryWrapper<UserVO> wrapper = new QueryWrapper<UserVO>(entity);
		List<UserVO> list = this.tblUserService.list(wrapper);
		PageVO pageVO = PageVO.getSuccessPageVO();
		pageVO.setData(list);
		return pageVO;
	}
	
	/**
	 * 分页查询所有    （结果却是查所有，没分页）
	 * @param vo
	 * @return
	 */
	@PostMapping("/user/queryAllUserByPage")
	public PageVO<PaginationVO<UserVO>> queryAllUserByPage(@RequestBody UserVO vo){
		IPage page = new Page<UserVO>(vo.getPageNumber(),vo.getPageSize()) ;
		Wrapper<UserVO> queryWrapper=new QueryWrapper<UserVO>(vo);
		IPage<UserVO> pageResult = this.tblUserService.page(page, queryWrapper);
		PaginationVO paginationVO = new PaginationVO();
		List<UserVO> records = pageResult.getRecords();
		paginationVO.setList(records);
		paginationVO.setPageNumber(pageResult.getCurrent());
		paginationVO.setPageSize(pageResult.getSize());
		paginationVO.setTotal(pageResult.getTotal());
		PageVO pageVO = PageVO.getSuccessPageVO();
		pageVO.setData(paginationVO);
		return pageVO;
	}
	
	/**
	 * 修改用户
	 * @param vo
	 * @return
	 */
	@PostMapping("/user/updateUser")
	public PageVO updateUser(@RequestBody UserVO vo) {
		
		boolean result=false;
		result=this.tblUserService.updateById(vo);
		if(result) {
			PageVO pageVO = PageVO.getSuccessPageVO();
			return pageVO;
		}
		return PageVO.getFailPageVO();
	}
	
	/**
	 * 添加用户
	 * @param vo
	 * @return
	 */
	@PostMapping("/user/addUser")
	public PageVO addUser(@RequestBody UserVO vo) {
		
		boolean result=false;
		result = this.tblUserService.save(vo);
		if(result) {
			return PageVO.getSuccessPageVO();
		}
		return PageVO.getFailPageVO();
	}
	
	/**
	 * 批量插入
	 * @param vo
	 * @return
	 */
	@PostMapping("/user/addUsers")
	public PageVO addUsers(@RequestBody List<UserVO> vo) {
		boolean result = false;
		result = tblUserService.saveBatch(vo);
		if(result) {
			return PageVO.getSuccessPageVO();
		}
		return PageVO.getFailPageVO();
	}
	
	/**
	 * 删除用户
	 * @param vo
	 * @return
	 */
	@PostMapping("/user/deleteUser")
	public PageVO deleteUser(@RequestBody UserVO vo) {
		boolean result=false;
		result = this.tblUserService.removeById(vo);
		if(result) {
			return PageVO.getSuccessPageVO();
		}
		return PageVO.getFailPageVO();
	}
	
	
}
