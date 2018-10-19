package com.unicom.engine_three.model;

public class UserValue {
	private String userId;
	// 一级 8-10G 高价值 10G以上，三级50M-3G，二级3-8G，高危 50M
	// 用户类别，一级、二级等
	private String userType;
	// 用户量
	private int userSum;
	// 语音量
	private double callAmount;
	// 流量
	private double flowAmout;
	// 产品
	private String product;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getUserSum() {
		return userSum;
	}

	public void setUserSum(int userSum) {
		this.userSum = userSum;
	}

	public double getCallAmount() {
		return callAmount;
	}

	public void setCallAmount(double callAmount) {
		this.callAmount = callAmount;
	}

	public double getFlowAmout() {
		return flowAmout;
	}

	public void setFlowAmout(double flowAmout) {
		this.flowAmout = flowAmout;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
}
