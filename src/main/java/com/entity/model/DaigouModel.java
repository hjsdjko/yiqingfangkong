package com.entity.model;

import com.entity.DaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 代购记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class DaigouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 代购商品
     */
    private String daigouName;


    /**
     * 发布业主
     */
    private Integer yonghuId;


    /**
     * 需求数量
     */
    private Integer daigouNumber;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情信息
     */
    private String daigouContent;


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
	 * 获取：代购商品
	 */
    public String getDaigouName() {
        return daigouName;
    }


    /**
	 * 设置：代购商品
	 */
    public void setDaigouName(String daigouName) {
        this.daigouName = daigouName;
    }
    /**
	 * 获取：发布业主
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布业主
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：需求数量
	 */
    public Integer getDaigouNumber() {
        return daigouNumber;
    }


    /**
	 * 设置：需求数量
	 */
    public void setDaigouNumber(Integer daigouNumber) {
        this.daigouNumber = daigouNumber;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情信息
	 */
    public String getDaigouContent() {
        return daigouContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setDaigouContent(String daigouContent) {
        this.daigouContent = daigouContent;
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
