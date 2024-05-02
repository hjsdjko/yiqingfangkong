package com.entity.vo;

import com.entity.JubaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 举报记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("jubao")
public class JubaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jubao_name")
    private String jubaoName;


    /**
     * 举报人
     */

    @TableField(value = "jubaoren")
    private String jubaoren;


    /**
     * 被举报人
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "beijubaoren")
    private Date beijubaoren;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 举报原因
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
	 * 设置：标题
	 */
    public String getJubaoName() {
        return jubaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setJubaoName(String jubaoName) {
        this.jubaoName = jubaoName;
    }
    /**
	 * 设置：举报人
	 */
    public String getJubaoren() {
        return jubaoren;
    }


    /**
	 * 获取：举报人
	 */

    public void setJubaoren(String jubaoren) {
        this.jubaoren = jubaoren;
    }
    /**
	 * 设置：被举报人
	 */
    public Date getBeijubaoren() {
        return beijubaoren;
    }


    /**
	 * 获取：被举报人
	 */

    public void setBeijubaoren(Date beijubaoren) {
        this.beijubaoren = beijubaoren;
    }
    /**
	 * 设置：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：举报时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：举报原因
	 */
    public String getYiqingcelveContent() {
        return yiqingcelveContent;
    }


    /**
	 * 获取：举报原因
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
