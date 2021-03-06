package de.SimonIT.gdxAppWarp.events;

public class ChatEvent {
	private final String chat;
	private final String sender;
	private final String locId;
	private final boolean isLocationLobby;
	private long time;

	public ChatEvent(String chat, String sender, String id, boolean fromLobby) {
		this.chat = chat;
		this.sender = sender;
		this.locId = id;
		this.isLocationLobby = fromLobby;
	}

	public String getLocationId() {
		return this.locId;
	}

	public boolean isLocationLobby() {
		return this.isLocationLobby;
	}

	public String getSender() {
		return this.sender;
	}

	public String getMessage() {
		return this.chat;
	}

	public long getTime() {
		return this.time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
