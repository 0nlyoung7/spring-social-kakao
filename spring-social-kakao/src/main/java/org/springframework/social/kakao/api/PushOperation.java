package org.springframework.social.kakao.api;

import java.util.List;

public interface PushOperation {
	/**
	 * <pre>
	 * Ǫ�� ��ū�� ����մϴ�.
	 * </pre>
	 * @param uuid 1 ~ 2^63-1 ������ ���� ������ ��
	 * @param deviceId ��� ���� id (��Ƽ ����̽� ������)
	 * @param pushType apns �Ǵ� gcm
	 * @param pushToken APNS, GCM���� �߱޹��� push token
	 * @return ���䳻���� �ش� �� �̳��� ������ ���� ��� ������� �ǹ��մϴ�.
	 */
	String register(String uuid, String deviceId, String pushType, String pushToken);
	
	/**
	 * <pre>
	 * Ǫ�� ��ū�� ��ȸ�մϴ�.
	 * </pre>
	 * @param uuid 1 ~ 2^63-1 ������ ���� ������ ��
	 * @return
	 */
	List<PushToken> tokens(String uuid);
	
	/**
	 * <pre>
	 * Ǫ�� ��ū�� �����մϴ�.
	 * </pre>
	 * @param uuid 1 ~ 2^63-1 ������ ���� ������ ��
	 * @param deviceId ��� ���� id
	 * @param pushType apns �Ǵ� gcm
	 */
	void deregister(String uuid, String deviceId, String pushType);
	
	/**
	 * <pre>
	 * Ǫ�� �޽����� �����մϴ�.
	 * 
	 * ������ Ǫ�� �˸��� �����Ͽ� forApns, forGcm �Ķ���� ���ǻ���.
	 * 1. Ǫ�� ����� on �ϰ�  GCM Key, APNS ������ �����Ͽ� ������� ���� �׸� ���ؼ��� null �� �����մϴ�.
	 *    - ex) GCM key �� ����Ͽ��ٸ� send(uuids, forApns, null); ó�� ȣ���մϴ�.
	 * 2. GCM Key �� APNS �������� ���� ��ϵǾ������� ��� ������ �÷��� ������ �޽����� ���� �� ��� 
	 *    ���� ����� �ƴ� �÷����� ���õ� �Ķ���ʹ� �⺻ �����ڷ� ��ü�� �����Ͽ� �����մϴ�.
	 *    - ex) GCM ���θ� �����ϰ��� �Ѵٸ� send(uuids, forApns, new ForGcm()); ó�� ȣ���մϴ�.
	 *    
	 * Ǫ�� ����� on�� ��Ȳ���� GCM key �Ǵ� APNS �������� ��ϵǾ� ���� �ʴٸ� for_xxx�� ���Ͽ� ���� �ʿ䰡 ������ 
	 * �Ѵ� ��� �Ǿ� ������� ���� ��� �÷����� �ƴϾ �ּ� {} �� �����ؾ��Ѵٴ� ��Ģ�� �����ϱ����� �Դϴ�.
	 * ���� - https://developer.kakao.com/docs/restapi#Ǫ��-�˸�-Ǫ��-�˸�-������
	 * </pre>
	 * @param uuids List���� uuid ���� 1  2^63-1 ������ ���� ������ ��
	 * @param forApns 
	 * @param forGcm
	 */
	void send(List<String> uuids, ForApns forApns, ForGcm forGcm);
}
