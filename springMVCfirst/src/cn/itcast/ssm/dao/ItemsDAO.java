package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.IndividualUser;
import cn.itcast.ssm.po.LegalPerson;
import cn.itcast.ssm.sso.IndUserSSO;
import net.sf.json.JSONObject;

public  class ItemsDAO {
	
	private IndividualUser individualUser = new IndividualUser();
	private LegalPerson legalPerson = new LegalPerson();
	
	
	public  IndividualUser getIndUsrDataByID(String userid )
	{
		IndUserSSO indUserSSO = new IndUserSSO();
		JSONObject obj = indUserSSO.indUserSSOgetUserInfoById(userid);
		
		System.out.println(obj);
		setIndUser(obj);
		
	
		return individualUser;
		
	}

	private void setIndUser(JSONObject obj) {
		individualUser.setAuthlevel(obj.getString("authlevel"));
		individualUser.setBirthday(obj.getString("birthday"));
//		individualUser.setCakey(obj.getString("cakey"));
		individualUser.setCity(obj.getString("city"));
		individualUser.setCountry(obj.getString("country"));
		individualUser.setEmail(obj.getString("email"));
//		individualUser.setHeadpicture();
		individualUser.setHomeaddress(obj.getString("homeaddress"));
		individualUser.setHomephone(obj.getString("homephone"));
		individualUser.setIdnum(obj.getString("idnum"));
		individualUser.setLoginname(obj.getString("loginname"));
		individualUser.setMobile(obj.getString("mobile"));
		individualUser.setNation(obj.getString("nation"));
		individualUser.setOfficeaddress(obj.getString("officeaddress"));
		individualUser.setOfficefax(obj.getString("officefax"));
		individualUser.setOfficephone(obj.getString("officenum"));
//		individualUser.setOrderby();
		individualUser.setPostcode(obj.getString("postcode"));
		individualUser.setProvince(obj.getString("province"));
		individualUser.setSex(obj.getString("sex"));
//		individualUser.setUseable();
		individualUser.setUserid(obj.getString("userid"));
		individualUser.setUsername(obj.getString("username"));
	}
	
	public  LegalPerson getLegPeronDataByID(String userid)
	{
		return legalPerson;
	}
	
	public static boolean isIndUsr(String userid)
	{
		return true;
	}
	
	public static boolean isLegPeron(String userid)
	{
		return false;
	}
	
}
