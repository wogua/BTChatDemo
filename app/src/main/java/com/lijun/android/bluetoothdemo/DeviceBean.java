package com.lijun.android.bluetoothdemo;

public class DeviceBean {
	protected String message;
	protected boolean isReceive;

	public DeviceBean(String msg, boolean isReceive) {
		this.message = msg;
		this.isReceive = isReceive;
	}
}