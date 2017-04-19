package cn.itcast.ssm.sso;

import java.security.MessageDigest;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.ws.Service;

import org.junit.Test;

import com.commnetsoft.api.webservice.OrgAndUserService;
import com.commnetsoft.api.webservice.OrgAndUserServicePortType;
import com.commnetsoft.proxy.SsoClient;
import com.commnetsoft.proxy.model.CallResult;

import cn.itcast.ssm.po.IndividualUser;
import net.sf.json.JSONObject;

public class IndUserSSO {
	private String servicecode = "zjzwfwzxzx";
	private String servicepwd = "zjzwfwzxzxpwd";
	private String time;
	private String sign;
	private String userid;
	private String datatype;
	private SsoClient client;
	
	@Test
	public void indUserSSOLogin()
	{
		String loginname = "mawenjun1989";
		String passwd = "1qaz@WSX";
		
		SsoClient client = SsoClient.getInstance();//单点登录工具
		SsoClient.initConfig("test6", "test6", "http://puser.zjzwfw.gov.cn/sso/");
		CallResult cr = client.login(loginname, "001", passwd);
		System.out.println("单点登录，错误码："+cr.getResult()+"，错误信息："+cr.getErrmsg()+"。 ");
		
		if("0".equals(cr.getResult())){//认证成功登录系统
			
			System.out.println("认证成功 ");
       //		return true;

       	}else{//认证失败
       		System.out.println("认证失败 ");
     //  		return false;
       	}
    	
		
	}
	
	public JSONObject indUserSSOgetUserInfoById(String userid)
	{

		
		String timestamp = getTimeStamp();		
		String sign = servicecode+servicepwd+timestamp;
		sign = stringToMD5Code32(sign);
		

		OrgAndUserService service = new OrgAndUserService();	
		OrgAndUserServicePortType orgAndUserServicePortType = service.getOrgAndUserServiceHttpPort();
		String r = orgAndUserServicePortType.getUserInfoById(servicecode, timestamp, sign, userid, "json");		
		JSONObject obj = JSONObject.fromObject(r);	
		System.out.println(obj);
		return obj;
	}
	private String getTimeStamp() {
		//得到long类型当前时间
		long l = System.currentTimeMillis();
		
		//new日期对象
		Date date = new Date(l);
		//转换提日期输出格式
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String time1 = dateFormat.format(date);
		return time1;
	}
	
	private String stringToMD5Code32(String sign1) {
		try 
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sign1.getBytes());
			sign1 = getEncode32(md);
			System.out.println(sign1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return sign1;
	}
	
    private static String getEncode32(MessageDigest digest) {
        StringBuilder builder = new StringBuilder();
        for (byte b : digest.digest()) {
                builder.append(Integer.toHexString((b >> 4) & 0xf));
                builder.append(Integer.toHexString(b & 0xf));
        }
        
        return builder.toString(); 
}

}
