package cn.smbms.service.info;

import java.util.List;

import cn.smbms.pojo.Informations;
import cn.smbms.pojo.Replies;

public interface InfoService {


	
    public List<Informations>findAll();//查找所有新闻资讯
	public List<Replies> getInfoById(int id);//通过指定的id查找相关所有回复

	public Informations findOneById(int id);//通过指定的id，查找某条资讯

	public void savere(Replies replies);//添加回复

	public void modify(int infoId);//按照资讯id

	public void addCount(int id);//添加查看数量
}
