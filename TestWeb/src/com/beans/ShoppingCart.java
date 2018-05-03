package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "shopping_cart", catalog = "cloud_shopping")
public class ShoppingCart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer orderId;
	private Integer orderNum;
	private long money;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** full constructor */
	public ShoppingCart(Integer userId, Integer orderId, Integer orderNum,
			long money) {
		this.userId = userId;
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.money = money;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "userId")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "orderId")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "orderNum")
	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name = "money", precision = 18, scale = 0)
	public long getMoney() {
		return this.money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", userId=" + userId + ", orderId="
				+ orderId + ", orderNum=" + orderNum + ", money=" + money + "]";
	}

}