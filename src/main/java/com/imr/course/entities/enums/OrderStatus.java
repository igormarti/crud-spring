package com.imr.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELL(5);

	private int cod;

	private OrderStatus(int cod) {
		this.cod = cod;
	}

	public int getCode() {
		return this.cod;
	}

	public static OrderStatus indexOf(int cod) {

		for (OrderStatus orderStatus : OrderStatus.values()) {
			if (orderStatus.getCode() == cod) {
				return orderStatus;
			}
		}

		throw new IllegalArgumentException("Invalid order status code.");
	}
}
