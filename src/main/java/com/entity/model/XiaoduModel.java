package com.entity.model;

import com.entity.XiaoduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 消毒记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class XiaoduModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 消毒区域
     */
    private String xiaoduName;


    /**
     * 消毒时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情信息
     */
    private String xiaoduContent;


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
	 * 获取：消毒区域
	 */
    public String getXiaoduName() {
        return xiaoduName;
    }


    /**
	 * 设置：消毒区域
	 */
    public void setXiaoduName(String xiaoduName) {
        this.xiaoduName = xiaoduName;
    }
    /**
	 * 获取：消毒时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：消毒时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情信息
	 */
    public String getXiaoduContent() {
        return xiaoduContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setXiaoduContent(String xiaoduContent) {
        this.xiaoduContent = xiaoduContent;
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
