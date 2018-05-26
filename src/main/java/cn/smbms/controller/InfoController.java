package cn.smbms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.smbms.pojo.Informations;
import cn.smbms.pojo.Replies;
import cn.smbms.service.info.InfoService;

@Controller
@RequestMapping(value="/info")
public class InfoController {
	@Resource
	private InfoService is;
	
	/*
	 * 查询所有新闻资讯
	 * */
@RequestMapping(value="/list.html")
public String getInfoList(Model model){
	List<Informations>infolist=new ArrayList<Informations>();
	infolist=is.findAll();
	System.out.println(is);
	
	model.addAttribute("infolist", infolist);
	System.out.println("model:"+model);
	return "list";
}
	/*
	 * 查看资讯具体详情
	 * */
	@RequestMapping(value="/infoshow.html",method=RequestMethod.GET)
	public String getInfoById(@RequestParam (value="id")int id,Model model){
		/**
		 * 添加查看资讯次数方法
		 */
		is.addCount(id);
		
		/**
		 * 根据id查找该资讯
		 */
		Informations info = is.findOneById(id);
		
		/**
		 * 将查到该条资讯存入model
		 */
		model.addAttribute("info", info);
		
		/**
		 * 通过资讯id,查找该条资讯所有回复信息
		 */
		List<Replies> reList = is.getInfoById(id);
		
		/**
		 * 将查询到的所有回复存入model
		 */
		model.addAttribute("reList", reList);
		
		
		return "showinfo";
	}
	
	
	public InfoService getIs() {
		return is;
	}
	public void setIs(InfoService is) {
		this.is = is;
	}
	
	
	//添加回复信息
	@RequestMapping(value="/addReply")
	public String addReply(Replies replies){
		//添加回复
		is.savere(replies);
		
		is.modify(replies.getInfoId());
		
		return "redirect:/info/list.html";
	}
}
