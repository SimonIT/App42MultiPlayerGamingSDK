package de.SimonIT.gdxAppWarp.events;

public class UpdateEvent {
	private final byte[] update;
	private final boolean isUnReliableUDP;

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
