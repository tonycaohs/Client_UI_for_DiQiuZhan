package org.sglt.dataservice.websocket.example;

import java.util.List;

import org.sglt.dataservice.pojo.Task;
import org.sglt.dataservice.websocket.TaskService;

public class TaskServiceUser {
	
	public static void main(String[] args) {
		
		TaskService taskService = new TaskServiceImpl();
		
		taskService.listTaskByArea("haidianqu", new AbstractReplyHanlder() {
			@Override
			public void success(Object data) {
				List<Task> tasks = (List<Task>)data;
				
				// 使用tasks数据展现到页面上。
			}
		});
	}
	
}
