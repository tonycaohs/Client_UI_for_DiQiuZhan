package org.sglt.dataservice.websocket;

import org.sglt.dataservice.ReplyHandler;

/**
 * 静态数据获取.
 * 
 * @author zhouyingzhao
 *
 */
public interface StaticDataService {
	
	/**
	 * 查询所有的分区.
	 * 返回数据：list[StaticData].
	 * 
	 * @param handler 数据处理器.
	 */
	public void listArea(ReplyHandler handler);
	
	/**
	 * 查询所有的任务状态.
	 * 返回数据：list[StaticData].
	 * 
	 * @param handler 数据处理器.
	 */
	public void listTaskStatus(ReplyHandler handler);
	
	/**
	 * 查询所有的物品分类.
	 * 返回数据：list[StaticData].
	 * 
	 * @param handler 数据处理器.
	 */
	public void listGoodsCategory(ReplyHandler handler);
}
