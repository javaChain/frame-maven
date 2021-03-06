package com.frame.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;

/**
 * ActiveMQ 消息生产类
 * 
 * @author Mafly
 *
 */
@Component
public class MessageSender {

	/** logger */
	private static final Logger logger = LoggerFactory.getLogger(MessageSender.class);

	@Autowired
	private JmsTemplate jmsTemplate;

	private String Queue = "default_queue";

	private String GoldQueue = "gold_queue";

	private JSONObject json = new JSONObject();

	/**
	 * 用户登录消息
	 */
	public void userLogin(long id, String username) {
		json.put("userid", id);
		json.put("username", username);

		logger.info("发送了一条消息。");
		// 发送到金币队列
		sendMessage(json.toJSONString(), 0);
	}

	/**
	 * 发送到消息队列
	 * 
	 * @param messgae
	 * @param type
	 *            类型，0:默认队列 1：金币队列 ...
	 */
	public void sendMessage(final String messgae, int type) {
		try {
			String destination = this.Queue;
			if (type == 1) {
				destination = GoldQueue;
			}
			jmsTemplate.send(destination, new MessageCreator() {
				@Override
				public Message createMessage(Session session) throws JMSException {
					TextMessage textMessage = session.createTextMessage(messgae);
					return textMessage;
				}
			});
		} catch (Exception e) {
			logger.error("", e);
		}
	}
}
