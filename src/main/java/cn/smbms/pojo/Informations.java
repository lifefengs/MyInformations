package cn.smbms.pojo;

import java.util.Date;
import java.util.List;

public class Informations {
private int id;//id
private String title;//发布信息标题
private String content;//详情
private int replyCount;//回复数量
private int viewCount;//查看数量
private Date reportTime;//回复时间
private Date lastMdTime;//最后修改时间
//与回复建立一对多关联关系
private List<Replies>repliselist;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getReplyCount() {
	return replyCount;
}
public void setReplyCount(int replyCount) {
	this.replyCount = replyCount;
}
public int getViewCount() {
	return viewCount;
}
public void setViewCount(int viewCount) {
	this.viewCount = viewCount;
}
public Date getReportTime() {
	return reportTime;
}
public void setReportTime(Date reportTime) {
	this.reportTime = reportTime;
}
public Date getLastMdTime() {
	return lastMdTime;
}
public void setLastMdTime(Date lastMdTime) {
	this.lastMdTime = lastMdTime;
}

public List<Replies> getRepliselist() {
	return repliselist;
}
public void setRepliselist(List<Replies> repliselist) {
	this.repliselist = repliselist;
}
public Informations(int id, String title, String content, int replyCount,
		int viewCount, Date reportTime, Date lastMdTime) {
	super();
	this.id = id;
	this.title = title;
	this.content = content;
	this.replyCount = replyCount;
	this.viewCount = viewCount;
	this.reportTime = reportTime;
	this.lastMdTime = lastMdTime;
}
public Informations() {
	super();
	// TODO Auto-generated constructor stub
}

}
