package cn.smbms.dao.info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Replies;

public interface RepliesDao {
	
	
	/**根据资讯的id查询全部的回复信息
	 * @param infoId
	 * @return
	 */
	public List<Replies> findAllByInfoId(@Param("infoId")int infoId);
	
	
	/**保存回复信息
	 * @param replies
	 */
	public void saveReply(Replies replies);
	
}
