package org.springframework.social.kakao.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ForApns {
	private boolean isEmpty = true;
	@JsonIgnore
	public boolean isEmpty() {
		return this.isEmpty;
	}
	
	private int badge;
	private String sound;
	private boolean push_alert;
	private Object message;
	private Map<String, Object> custom_field = new LinkedHashMap<String, Object>();
	
	public int getBadge() {
		return badge;
	}
	public void setBadge(int badge) {
		this.isEmpty = false;
		this.badge = badge;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.isEmpty = false;
		this.sound = sound;
	}
	public boolean isPush_alert() {
		return push_alert;
	}
	public void setPush_alert(boolean push_alert) {
		this.isEmpty = false;
		this.push_alert = push_alert;
	}
	
	/**
	 * <pre>
	 * Apns�� ��� ��Ŷ ���ѿ� ���� ������� �ۿ� �̸� �޽��� format�� �����صΰ� �ش� format�� Ű�� �Ķ���͸� ������ ������.
	 * �̷���� message�� �ܼ� ���ڿ��� �ƴ� json object�� ���۵�
	 * ���� �ش� �׸��� ����ڰ� �޽����� ������ ��Ŀ� ���� String �Ǵ� LinkedHashMap<String, Object> ��ü�� ��ȯ��
	 * </pre>
	 * @return
	 */
	public Object getMessage() {
		return message;
	}
	/**
	 * <pre>
	 * �ܼ� ���ڿ� �޽����� �����Ѵ�.
	 * �� ��� getMessage ���� object�� String ���� casting�� �����մϴ�.
	 * </pre>
	 * @param message
	 */
	public void setMessage(String message) {
		this.isEmpty = false;
		this.message = message;
	}
	/**
	 * <pre>
	 * �����õ� ���ڿ� ������ ���� �޽����� �����մϴ�.
	 * �� ��� getMessage ���� object�� LinkedHashMap<String, Object>�� casting�� �����մϴ�.
	 * 
	 * ���� : https://developer.apple.com/library/ios/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/Chapters/ApplePushService.html
	 * </pre>
	 * @param locKey
	 * @param locArgs
	 */
	public void setMessage(String locKey, List<String> locArgs) {
		this.isEmpty = false;
		LinkedHashMap<String, Object> tmp = new LinkedHashMap<String, Object>();
		tmp.put("loc-key", locKey);
		tmp.put("loc-args", locArgs);
		this.message = tmp;
	}
	
	public void addCustom_field(String key, Object value) {
		this.isEmpty = false;
		custom_field.put(key, value);
	}
	public Map<String, Object> getCustom_field() {
		return custom_field;
	}
	
	public ForApns(){}
	public ForApns(int badge, String sound, boolean push_alert, String message) {
		this.isEmpty = false;
		
		this.badge = badge;
		this.sound = sound;
		this.push_alert = push_alert;
		this.message = message;
	}
	public ForApns(int badge, String sound, boolean push_alert, String locKey, List<String> locArgs) {
		this.isEmpty = false;
		
		this.badge = badge;
		this.sound = sound;
		this.push_alert = push_alert;
		setMessage(locKey, locArgs);
	}
}
