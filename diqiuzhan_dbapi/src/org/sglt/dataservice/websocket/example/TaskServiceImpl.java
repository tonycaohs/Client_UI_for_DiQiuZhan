package org.sglt.dataservice.websocket.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sglt.dataservice.ReplyHandler;
import org.sglt.dataservice.pojo.Goods;
import org.sglt.dataservice.pojo.Task;
import org.sglt.dataservice.websocket.TaskService;

public class TaskServiceImpl implements TaskService {

	@Override
	public void createTask(String area, String phone, String category,
			ReplyHandler handler) {
		handler.success(null);
	}

	@Override
	public void updateTask(Map<String, Object> task, ReplyHandler handler) {
		handler.success(null);

	}

	@Override
	public void addGoods2Task(Goods goods, String taskId, ReplyHandler handler) {
		handler.success(null);

	}

	@Override
	public void listTaskByArea(String area, ReplyHandler handler) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task());
		handler.success(list);
	}

	@Override
	public void listTaskByCategory(String category, ReplyHandler handler) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task());
		handler.success(list);

	}

	@Override
	public void listTaskByDate(String startDate, String endDate,
			ReplyHandler handler) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task());
		handler.success(list);

	}

	@Override
	public void listTask(String name, String ownerId, ReplyHandler handler) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task());
		handler.success(list);

	}

	@Override
	public void getTask(String id, ReplyHandler handler) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task());
		handler.success(list);
	}

}
