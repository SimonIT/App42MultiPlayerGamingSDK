package de.SimonIT.gdxAppWarp.events;

public class ConnectEvent {
	private final byte result;
	private final int reasonCode;

	public ConnectEvent(byte result) {
		this.result = result;
		this.reasonCode = 0;
	}

	public ConnectEvent(byte result, int reasonCode) {
		this.result = result;
		this.reasonCode = reasonCode;
	}

	public byte getResult() {
		return this.result;
	}

	public int getReasonCode() {
		return this.reasonCode;
	}
}
