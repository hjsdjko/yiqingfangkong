package com.entity.model;

import com.entity.JubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 举报记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class JubaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jubaoName;


    /**
     * 举报人
     */
    private String jubaoren;


    /**
     * 被举报人
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date beijubaoren;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 举报原因
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
	 * 获取：标题
	 */
    public String getJubaoName() {
        return jubaoName;
    }


    /**
	 * 设置：标题
	 */
    public void setJubaoName(String jubaoName) {
        this.jubaoName = jubaoName;
    }
    /**
	 * 获取：举报人
	 */
    public String getJubaoren() {
        return jubaoren;
    }


    /**
	 * 设置：举报人
	 */
    public void setJubaoren(String jubaoren) {
        this.jubaoren = jubaoren;
    }
    /**
	 * 获取：被举报人
	 */
    public Date getBeijubaoren() {
        return beijubaoren;
    }


    /**
	 * 设置：被举报人
	 */
    public void setBeijubaoren(Date beijubaoren) {
        this.beijubaoren = beijubaoren;
    }
    /**
	 * 获取：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：举报时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：举报原因
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 设置：举报原因
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
