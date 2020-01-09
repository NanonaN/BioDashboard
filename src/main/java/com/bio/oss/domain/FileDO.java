package com.bio.oss.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <pre>
 * 文件上传
 * </pre>
 * <small> 2018年3月23日 | Aron</small>
 */
@TableName("sys_file")
public class FileDO extends Model<FileDO> implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    
    //
    @TableId
    private Long id;
    // 文件类型
    private Integer type;
    // URL地址
    private String url;
    // 创建时间
    private Date createDate;

    public FileDO() {
        super();
    }

    public FileDO(Integer type, String url, Date createDate) {
        super();
        this.type = type;
        this.url = url;
        this.createDate = createDate;
    }

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：文件类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取：文件类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置：URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "FileDO{" + "id=" + id + ", type=" + type + ", url='" + url + '\'' + ", createDate=" + createDate + '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
