package com.entity.vo;

import com.entity.DaigouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 代购记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("daigou")
public class DaigouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 代购商品
     */

    @TableField(value = "daigou_name")
    private String daigouName;


    /**
     * 发布业主
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 需求数量
     */

    @TableField(value = "daigou_number")
    private Integer daigouNumber;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情信息
     */

    @TableField(value = "daigou_content")
    private String daigouContent;


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
	 * 设置：代购商品
	 */
    public String getDaigouName() {
        return daigouName;
    }


    /**
	 * 获取：代购商品
	 */

    public void setDaigouName(String daigouName) {
        this.daigouName = daigouName;
    }
    /**
	 * 设置：发布业主
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布业主
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：需求数量
	 */
    public Integer getDaigouNumber() {
        return daigouNumber;
    }


    /**
	 * 获取：需求数量
	 */

    public void setDaigouNumber(Integer daigouNumber) {
        this.daigouNumber = daigouNumber;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getDaigouContent() {
        return daigouContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setDaigouContent(String daigouContent) {
        this.daigouContent = daigouContent;
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
