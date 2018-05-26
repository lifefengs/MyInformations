package cn.smbms.service.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.info.InformationsDao;
import cn.smbms.dao.info.RepliesDao;
import cn.smbms.pojo.Informations;
import cn.smbms.pojo.Replies;
@Service
@Transactional
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InformationsDao info;
	@Autowired
	private RepliesDao re;

	//通过新闻资讯，查找指定指定的资讯的所有回复
    public List<Replies> getInfoById(int id) {
		return re.findAllByInfoId(id);
	}
    //通过资讯id,查找指定的资讯
	public Informations findOneById(int id) {
		return info.findById(id);
	}
    //添加回复
	public void savere(Replies replies) {
		// TODO Auto-generated method stub
		re.saveReply(replies);
	}
   
	
	public void modify(int infoId) {
		// TODO Auto-generated method stub
		info.modifyReplyAndLastTime(infoId);
	}
	
    /**
     * 添加访问资讯的次数
     */
	public void addCount(int id) {
		info.updateViewCount(id);
	}




/**
 * 查询所有资讯信息
 */
	public List<Informations> findAll() {
		// TODO Auto-generated method stub
		return info.findAll();
	}

}
