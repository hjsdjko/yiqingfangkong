package com.entity.model;

import com.entity.LaifangrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 来访人员记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class LaifangrenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 来访人员名称
     */
    private String laifangrenName;


    /**
     * 来访目的
     */
    private String laifangrenMudi;


    /**
     * 来访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情信息
     */
    private String yiqingcelveContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：来访人员名称
	 */
    public String getLaifangrenName() {
        return laifangrenName;
    }


    /**
	 * 设置：来访人员名称
	 */
    public void setLaifangrenName(String laifangrenName) {
        this.laifangrenName = laifangrenName;
    }
    /**
	 * 获取：来访目的
	 */
    public String getLaifangrenMudi() {
        return laifangrenMudi;
    }


    /**
	 * 设置：来访目的
	 */
    public void setLaifangrenMudi(String laifangrenMudi) {
        this.laifangrenMudi = laifangrenMudi;
    }
    /**
	 * 获取：来访时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：来访时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情信息
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setYiqingcelveContent(String yiqingcelveContent) {
        this.yiqingcelveContent = yiqingcelveContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
