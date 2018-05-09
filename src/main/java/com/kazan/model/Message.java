package com.kazan.model;

import java.util.Date;

public class Message {
	
	private Integer messageId;	
	private Date messageTime;
	private String note;
	private String content;
	private String imageUrl;
	
	private Integer telegramId;
	private String groupName;
	private Integer countSend;
	
	private String telegramTokenBot;
	private Integer messageType;
	
	public Integer getTelegramId() {
		return telegramId;
	}

	public void setTelegramId(Integer telegramId) {
		this.telegramId = telegramId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getCountSend() {
		return countSend;
	}

	public void setCountSend(Integer countSend) {
		this.countSend = countSend;
	}
	public void addCountSend() {
		this.countSend = this.countSend+1;
	}

	public String getTelegramTokenBot() {
		return telegramTokenBot;
	}

	public void setTelegramTokenBot(String telegramTokenBot) {
		this.telegramTokenBot = telegramTokenBot;
	}	
	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Date getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((countSend == null) ? 0 : countSend.hashCode());
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		result = prime * result + ((messageTime == null) ? 0 : messageTime.hashCode());
		result = prime * result + ((messageType == null) ? 0 : messageType.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((telegramId == null) ? 0 : telegramId.hashCode());
		result = prime * result + ((telegramTokenBot == null) ? 0 : telegramTokenBot.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		Message message = (Message) o;
		if(null == message || null == message.getTelegramId() || null == this.telegramId) return false;
		System.out.println(this.telegramId + "|" + message.telegramId + "|" + (this.telegramId.equals(message.telegramId)));
	    if(this.telegramId.equals(message.telegramId)) return true;
	    return false;
	}
}
