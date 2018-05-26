package cn.smbms.pojo;

import java.util.Date;

public class Replies {
private int id;//id
private String content;//详情
private Date replyTime;//回复时间
private int infoId;//资讯的id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getReplyTime() {
	return replyTime;
}
public void setReplyTime(Date replyTime) {
	this.replyTime = replyTime;
}
public int getInfoId() {
	return infoId;
}
public void setInfoId(int infoId) {
	this.infoId = infoId;
}
public Replies(int id, String content, Date replyTime, int infoId) {
	super();
	this.id = id;
	this.content = content;
	this.replyTime = replyTime;
	this.infoId = infoId;
}
public Replies() {
	super();
	// TODO Auto-generated constructor stub
}

}
