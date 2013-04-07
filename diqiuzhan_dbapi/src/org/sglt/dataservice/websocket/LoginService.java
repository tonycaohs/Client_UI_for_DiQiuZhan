package org.sglt.dataservice.websocket;

import org.sglt.dataservice.ReplyHandler;

/**
 * 负责处理登录登录和登出的数据服务类.
 * @author zhouyingzhao
 */
public interface LoginService {
	
	/**
	 * 负责登录的接口。
	 * 无返回数据.
	 * 
	 * @param username 用户名.
	 * @param passord 密码.
	 * @param handler 返回处理. 
	 */
	public void login(String username, String passord, ReplyHandler handler);
	
	/**
	 * 负责注销系统用户.
	 * 无返回数据。
	 * 
	 * @param sessionId 
	 * @param handler
	 */
	public void logout(String sessionId, ReplyHandler handler);
}
