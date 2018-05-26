package cn.smbms.dao.info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Informations;

public interface InformationsDao {
	
	
	/**查询所有资讯,并按最后修改时间降序 
	 * @return
	 */
	public List<Informations> findAll();
	
	
	/**根据id查询相应的资讯
	 * @param id
	 * @return
	 */
	public Informations findById(@Param("id")int id);
	
	
	
	/**修改查看次数
	 * @param id
	 * @param viewCount
	 */
	public void updateViewCount(@Param("id")int id);
	
	
	
	/**修改资讯的回复次数和最后修改时间
	 * 
	 */
	public void modifyReplyAndLastTime(@Param("id")int infoId);
	
	
	/**
	 * 添加查看新闻资讯的查看数量
	 */
	public void addCount(int id);//添加查看数量
}
