package org.sglt.dataservice.websocket;

import java.util.Map;

import org.sglt.dataservice.ReplyHandler;
import org.sglt.dataservice.pojo.Goods;

/**
 * 负责处理任务的服务接口.
 * 
 * @author zhouyingzhao
 *
 */
public interface TaskService {
	
	/**
	 * 创建任务.
	 * 无返回数据.
	 * 
	 * @param area 任务所属分区.
	 * @param phone 电话号码.
	 * @param category 物品分类.
	 * @param handler 数据处理.
	 */
	public void createTask(String area, String phone, String category, ReplyHandler handler);
	
	/**
	 * 更新任务信息.
	 * 无返回数据.
	 * 
	 * @param task Map形式的更新数据，字段名字到字段值的映射.
	 * @param handler 数据处理器.
	 */
	public void updateTask(Map<String, Object> task, ReplyHandler handler);
	
	/**
	 * 在一个任务中添加一个物品.
	 * 
	 * @param goods 物品.
	 * @param taskId 任务id.
	 * @param handler 数据处理器.
	 */
	public void addGoods2Task(Goods goods, String taskId, ReplyHandler handler);
	
	/**
	 * 获取一个分区内的所有的任务.
	 * 返回数据为List[Task].
	 * 
	 * @param area 分区code.
	 * @param handler 数据处理器.
	 */
	public void listTaskByArea(String area, ReplyHandler handler);
	
	/**
	 * 获取物品为某一类的所有任务.
	 * 返回数据为List[Task].
	 * 
	 * @param category 物品分类.
	 * @param handler 数据处理器.
	 */
	public void listTaskByCategory(String category, ReplyHandler handler);
	
	/**
	 * 获取一个时间段内的所有任务.
	 * 目前考虑使用入库时间作为查询条件.
	 * 
	 * 返回数据为List[Task].
	 * 
	 * @param 查询开始日期，格式为yyyy-MM-dd.
	 * @param 查询结束日期，格式为yyyy-MM-dd.
	 * @param handler 数据处理器.
	 */
	public void listTaskByDate(String startDate, String endDate, ReplyHandler handler);
	
	/**
	 * 根据条件查询任务列表.
	 * 其中如果条件传入为null或者""字符串，忽略该查询条件.
	 * 
	 * 返回数据为List[Task].
	 * 
	 * @param name 姓名，模糊匹配.
	 * @param ownerId 证件号码，模糊匹配.
	 * @param handler 数据处理器.
	 */
	public void listTask(String name, String ownerId, ReplyHandler handler);
	
	/**
	 * 根据id，获取一个task。
	 * 返回数据位task。
	 * 
	 * @param id task id.
	 */
	public void getTask(String id, ReplyHandler handler);
	
	
}
