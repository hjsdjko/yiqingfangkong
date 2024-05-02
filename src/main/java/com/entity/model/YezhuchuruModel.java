package com.entity.model;

import com.entity.YezhuchuruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 业主出入记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class YezhuchuruModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 出入业主
     */
    private Integer yonghuId;


    /**
     * 出入目的
     */
    private String yezhuchuruMudi;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 出入类型
     */
    private Integer yezhuchuruTypes;


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
	 * 获取：出入业主
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：出入业主
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：出入目的
	 */
    public String getYezhuchuruMudi() {
        return yezhuchuruMudi;
    }


    /**
	 * 设置：出入目的
	 */
    public void setYezhuchuruMudi(String yezhuchuruMudi) {
        this.yezhuchuruMudi = yezhuchuruMudi;
    }
    /**
	 * 获取：出入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：出入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：出入类型
	 */
    public Integer getYezhuchuruTypes() {
        return yezhuchuruTypes;
    }


    /**
	 * 设置：出入类型
	 */
    public void setYezhuchuruTypes(Integer yezhuchuruTypes) {
        this.yezhuchuruTypes = yezhuchuruTypes;
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
