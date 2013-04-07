package org.sglt.dataservice;

/**
 * 数据请求返回信息处理.
 * 主要有三个处理接口：
 * 1. 获取到期望的数据；
 * 2. 违反了业务约束，需要处理的异常消息；
 * 3. 技术性异常。
 * @author zhouyingzhao
 *
 */
public interface ReplyHandler {
	
	/**
	 * 处理正确返回的数据，实现时参见具体的数据定义.
	 * @param data 返回的数据.
	 */
	public void success(Object data);
	
	/**
	 * 正常返回了，但是违反业务约束，比如登录时用户名不存在等错误。
	 * 
	 * @param errorMessage 错误消息。
	 */
	public void failure(String errorMessage);
	
	/**
	 * 请求服务时，发生技术性异常。比如服务器端连不上。
	 * @param e 具体发生的异常。
	 */
	public void exception(Exception e);
	
}
