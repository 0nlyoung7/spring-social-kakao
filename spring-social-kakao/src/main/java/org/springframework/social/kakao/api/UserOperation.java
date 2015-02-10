package org.springframework.social.kakao.api;

public interface UserOperation {
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� ���� id���� �����ɴϴ�.
	 * </pre>
	 * @return
	 */
	long getProfileId();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� �г��� ������ �����ɴϴ�.
	 * </pre>
	 * @return
	 */
	String getNickname();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� ������ ������ ��ȸ�մϴ�.
	 * </pre>
	 * @return
	 */
	KakaoProfile getUserProfile();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� �� ������ ���� �մϴ�.
	 * - �۰��� �����̿����� ����� �ش� ����� ������ ���� �Ǿ� ���� �Ұ����մϴ�.
	 * </pre> 
	 * @return
	 */
	KakaoProfile unlink();
	
	/**
	 * <pre>
	 * �ش� access token�� ���¸� Ȯ���Ѵ�.
	 *  - �������� ��ū�� ��� 401 error �߻� (org.springframework.web.client.HttpClientErrorException)
	 * </pre>
	 * @return
	 */
	AccessTokenInfo accessTokenInfo();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� ������ ������ �����մϴ�.
	 *  - ������ ���������� Ȯ�ΰ����� default field�̿ܿ� �����ڰ� �߰��� custom field�� �����Ϳ� ���� �����͸� �����ϴµ� ����մϴ�.
	 *  - ��ȯ �����Ϳ��� ������Ʈ�� ������� id �� �����մϴ�. 
	 * </pre>
	 * @param profileJsonString
	 * @return
	 */
	KakaoProfile updateProfile(String profileJsonString);
}