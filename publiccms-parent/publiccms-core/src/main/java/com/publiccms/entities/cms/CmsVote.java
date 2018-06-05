package com.publiccms.entities.cms;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsVote generated by hbm2java
 */
@Entity
@Table(name = "cms_vote")
@DynamicUpdate
public class CmsVote implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Integer id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
    @GeneratorColumn(title = "开始日期", condition = true, order = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @GeneratorColumn(title = "结束日期", condition = true, order = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    @GeneratorColumn(title = "最大投票数")
    private int maxVote;
    @GeneratorColumn(title = "参与人数", order = true)
    private int userCounts;
    @GeneratorColumn(title = "地址")
    private String url;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "描述")
    private String description;
    @GeneratorColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public CmsVote() {
    }

    public CmsVote(short siteId, Date startDate, Date endDate, int maxVote, int userCounts, String url, String title,
            boolean disabled) {
        this.siteId = siteId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxVote = maxVote;
        this.userCounts = userCounts;
        this.url = url;
        this.title = title;
        this.disabled = disabled;
    }

    public CmsVote(short siteId, Date startDate, Date endDate, int maxVote, int userCounts, String url, String title,
            String description, boolean disabled) {
        this.siteId = siteId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxVote = maxVote;
        this.userCounts = userCounts;
        this.url = url;
        this.title = title;
        this.description = description;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date", nullable = false, length = 19)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date", nullable = false, length = 19)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "max_vote", nullable = false)
    public int getMaxVote() {
        return this.maxVote;
    }

    public void setMaxVote(int maxVote) {
        this.maxVote = maxVote;
    }

    @Column(name = "user_counts", nullable = false)
    public int getUserCounts() {
        return this.userCounts;
    }

    public void setUserCounts(int userCounts) {
        this.userCounts = userCounts;
    }

    @Column(name = "url", nullable = false, length = 2048)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
