package com.yl.user.utils;


import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName(value = "tb_user")
public class UserVO implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    // 用户名
     private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;
    
    @TableField(exist = false)
    private Long pageNumber;
    
    @TableField(exist = false)
    private Long pageSize;

    public UserVO() {
    	
    }



	public UserVO(Long id, String userName, String password, String name, Integer age, Integer sex, Date birthday,
			Date created, Date updated, Long pageNumber, Long pageSize) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.created = created;
		this.updated = updated;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}




	public Long getPageNumber() {
		return pageNumber;
	}



	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}



	public Long getPageSize() {
		return pageSize;
	}



	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name + ", age="
				+ age + ", sex=" + sex + ", birthday=" + birthday + ", created=" + created + ", updated=" + updated
				+ "]";
	}

	
}
