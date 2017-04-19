package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.ssm.po.IndividualUser;
import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.LegalPerson;
import cn.itcast.ssm.po.VisitorCard;

import cn.itcast.ssm.dao.*;
/**
 * 
 *  Author: Dorgon
 *  Date: 2017-04-14
 */
public class ItemsController1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		
		String userid = request.getParameter("userid").toString();
		ItemsDAO itemsDAO = new ItemsDAO();
		ModelAndView modelAndView =  new ModelAndView();
		
		
		if(ItemsDAO.isIndUsr(userid))
		{
			List<IndividualUser> itemsList = new ArrayList<IndividualUser>();
			IndividualUser items = itemsDAO.getIndUsrDataByID(userid);
			itemsList.add(items);
			modelAndView.addObject("itemsList", itemsList);
		}
		else if(ItemsDAO.isLegPeron(userid))
		{
			List<LegalPerson> itemsList = new ArrayList<LegalPerson>();
			LegalPerson items = itemsDAO.getLegPeronDataByID(userid);
			itemsList.add(items);
			modelAndView.addObject("itemsList", itemsList);
		}
		else
		{
			
		}
		
          modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//        modelAndView.setViewName("/WEB-INF/jsp/items/ticketlogin.jsp");
	
        
		return modelAndView;
	}

}
