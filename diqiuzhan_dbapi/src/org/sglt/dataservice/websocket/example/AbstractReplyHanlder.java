package org.sglt.dataservice.websocket.example;

import org.sglt.dataservice.ReplyHandler;

public abstract class AbstractReplyHanlder implements ReplyHandler {

	@Override
	public void failure(String errorMessage) {
		// 显示错误消息的通用代码.
	}

	@Override
	public void exception(Exception e) {
		// 处理异常的通用代码.
	}

}
