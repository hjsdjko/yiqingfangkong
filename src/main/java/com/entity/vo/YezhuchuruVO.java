package com.entity.vo;

import com.entity.YezhuchuruEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 业主出入记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yezhuchuru")
public class YezhuchuruVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 出入业主
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 出入目的
     */

    @TableField(value = "yezhuchuru_mudi")
    private String yezhuchuruMudi;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 出入类型
     */

    @TableField(value = "yezhuchuru_types")
    private Integer yezhuchuruTypes;


    /**
     * 详情信息
     */

    @TableField(value = "yiqingcelve_content")
    private String yiqingcelveContent;


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
	 * 设置：出入业主
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：出入业主
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：出入目的
	 */
    public String getYezhuchuruMudi() {
        return yezhuchuruMudi;
    }


    /**
	 * 获取：出入目的
	 */

    public void setYezhuchuruMudi(String yezhuchuruMudi) {
        this.yezhuchuruMudi = yezhuchuruMudi;
    }
    /**
	 * 设置：出入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：出入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：出入类型
	 */
    public Integer getYezhuchuruTypes() {
        return yezhuchuruTypes;
    }


    /**
	 * 获取：出入类型
	 */

    public void setYezhuchuruTypes(Integer yezhuchuruTypes) {
        this.yezhuchuruTypes = yezhuchuruTypes;
    }
    /**
	 * 设置：详情信息
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setYiqingcelveContent(String yiqingcelveContent) {
        this.yiqingcelveContent = yiqingcelveContent;
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
