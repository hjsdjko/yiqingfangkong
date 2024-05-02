package com.entity.vo;

import com.entity.XiaoduEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 消毒记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("xiaodu")
public class XiaoduVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 消毒区域
     */

    @TableField(value = "xiaodu_name")
    private String xiaoduName;


    /**
     * 消毒时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情信息
     */

    @TableField(value = "xiaodu_content")
    private String xiaoduContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：消毒区域
	 */
    public String getXiaoduName() {
        return xiaoduName;
    }


    /**
	 * 获取：消毒区域
	 */

    public void setXiaoduName(String xiaoduName) {
        this.xiaoduName = xiaoduName;
    }
    /**
	 * 设置：消毒时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：消毒时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getXiaoduContent() {
        return xiaoduContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setXiaoduContent(String xiaoduContent) {
        this.xiaoduContent = xiaoduContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
