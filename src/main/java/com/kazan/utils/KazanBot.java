package com.kazan.utils;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class KazanBot extends TelegramLongPollingBot {
	
	private String username;
	private String token;
	
	public KazanBot(String username, String token) {
		this.username = username;
		this.token = token;
	}

	@Override
	public String getBotUsername() {
		return username;
	}

	@Override
	public void onUpdateReceived(Update update) {
	    // TODO
	}

	@Override
	public String getBotToken() {
		return token;
	}
}
