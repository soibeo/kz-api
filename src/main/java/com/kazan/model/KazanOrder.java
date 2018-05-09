package com.kazan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ORDERS")
public class KazanOrder {
	
	@Id
	@GeneratedValue
	@Column(name = "order_Id")
	int orderId;
	
	@Column(name = "Order_Ticket")
	int OrderTicket;
	
	@Column(name = "Order_Symbol")
	String OrderSymbol;
	
	@Column(name = "Order_Type")
	int OrderType;
	
	@Column(name = "Order_Lots")
	double OrderLots;

	//==========================================
	@Column(name = "Order_Open_Price")
	double OrderOpenPrice;
	
	@Column(name = "Order_Close_Price")
	double OrderClosePrice;
	
	@Column(name = "Order_Profit")
	double OrderProfit;
	
	@Column(name = "Order_StopLoss")
	double OrderStopLoss;
	
	@Column(name = "Order_Take_Profit")
	double OrderTakeProfit;

	//==========================================
	@Column(name = "Order_Open_Time")
	Date OrderOpenTime;
	
	@Column(name = "Order_Close_Time")
	Date OrderCloseTime;

	@Column(name = "Order_Commission")
	double OrderCommission;
	
	@Column(name = "Order_Swap")
	double OrderSwap;

	@Column(name = "Order_Magic_Number")
	String OrderComment;
	int OrderMagicNumber;
	
	@Column(name = "userId")
	int userId;
	
	@Column(name = "groupId")
	int groupId;
}
