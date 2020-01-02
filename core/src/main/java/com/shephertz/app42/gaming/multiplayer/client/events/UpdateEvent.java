package com.shephertz.app42.gaming.multiplayer.client.events;

public class UpdateEvent {
	private byte[] update;
	private boolean isUnReliableUDP;

	public UpdateEvent(byte[] update, boolean udp) {
		this.update = update;
		this.isUnReliableUDP = udp;
	}

	public byte[] getUpdate() {
		return this.update;
	}

	public boolean isUDP() {
		return this.isUnReliableUDP;
	}
}