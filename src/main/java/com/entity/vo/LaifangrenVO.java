package com.entity.vo;

import com.entity.LaifangrenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 来访人员记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("laifangren")
public class LaifangrenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 来访人员名称
     */

    @TableField(value = "laifangren_name")
    private String laifangrenName;


    /**
     * 来访目的
     */

    @TableField(value = "laifangren_mudi")
    private String laifangrenMudi;


    /**
     * 来访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：来访人员名称
	 */
    public String getLaifangrenName() {
        return laifangrenName;
    }


    /**
	 * 获取：来访人员名称
	 */

    public void setLaifangrenName(String laifangrenName) {
        this.laifangrenName = laifangrenName;
    }
    /**
	 * 设置：来访目的
	 */
    public String getLaifangrenMudi() {
        return laifangrenMudi;
    }


    /**
	 * 获取：来访目的
	 */

    public void setLaifangrenMudi(String laifangrenMudi) {
        this.laifangrenMudi = laifangrenMudi;
    }
    /**
	 * 设置：来访时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：来访时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
