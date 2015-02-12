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
	 * @param profileJsonString �����ϰ��� �ϴ� ������ ������ json������ key:value 
	 * @return
	 */
	KakaoProfile updateProfile(String profileJsonString);
	
	/**
	 * <pre>
	 * �α׾ƿ�
	 *  - ��ȯ �����ʹ� ������Ʈ�� ������� id �� �����մϴ�.
	 * </pre>
	 * @return
	 */
	KakaoProfile logout();
	
	/**
	 * <pre>
	 * �� ����
	 *  - īī�� �÷��� ���񽺿��� �ڵ� �� ���� ����� �����ϹǷ� �ش� ����� ���� �ϰ� ����� ��쿡�� ����մϴ�.
	 *  - �� ���� ����� ȣ�� �Ҷ� updateProfile�� �����ϴ� ����� ���� ���� ����� ���ÿ� �����˴ϴ�. (���������� ��ġ ���� ��� null �Ǵ� empty string ���� �Ķ���ͷ� �����ϸ� �˴ϴ�.)
	 * </pre>
	 * @return
	 */
	KakaoProfile signup(String profileJsonString);
	
	/**
	 * <pre>
	 * ����� ��� ��������
	 *  - admin key�� �̿��Ͽ� �ش� �ۿ� ����Ǿ��ִ� ����� ����� ��ȸ�մϴ�.
	 *    �˻� ���� �Ķ���Ͱ� ���� ��ȸ�� �����ϴ°����� (�˻� ���� �Ķ���ʹ� ���� optional)
	 *    order �ɼ��� asc�� ��ȸ�Ǵ� ����� ���� �⺻���� 100����� ��ȸ�˴ϴ�.
	 *    ���û����� �Ʒ��� kakao rest api ���߰��̵� �������� ���� �Ͻñ� �ٶ��ϴ�.
	 *    https://developer.kakao.com/docs/restapi#�����-����-�����-����Ʈ-��û 
	 * </pre>
	 * @return
	 */
	KakaoIds ids();
	
	/**
	 * <pre>
	 * ����� ��� ��������
	 *  - admin key�� �̿��Ͽ� �ش� �ۿ� ����Ǿ��ִ� ����� ����� ��ȸ�մϴ�.
	 *    �˻� ���� �Ķ���͸� �����Ͽ� ��ȸ �Ҷ� ����ϸ� �� �Ķ���� ������ 
	 *    ids() �޼����� �ּ��� �����ִ� ���߰��̵� �������� ���� �Ͻñ� �ٶ��ϴ�.
	 * </pre>
	 * @param limit
	 * @param fromId
	 * @param order
	 * @return
	 */
	KakaoIds ids(String limit, String fromId, String order);
	
	/**
	 * <pre>
	 * ����� ���� ��ȸ�ϱ�.
	 * �ش� ����� �������� admin key�� Ư�� ���� id (kakao �÷������� �߱޵Ǵ� ���� ������ȣ)�� �̿��Ͽ� �ش� ������� ������ ��ȸ�Ѵ�.
	 * </pre>
	 * @param userId
	 * @return
	 */
	KakaoProfile getUserProfile(String userId);
}