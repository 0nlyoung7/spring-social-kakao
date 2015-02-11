package org.springframework.social.kakao.api;

import org.springframework.social.ApiBinding;

public interface Kakao extends ApiBinding {
	/**
	 * <pre>
	 * ����� ���� API ȣ��
	 * </pre>
	 * @return
	 */
	UserOperation userOperation();
	
	/**
	 * <pre>
	 * īī�� ���丮 API ȣ��
	 * </pre>
	 * @return
	 */
	StoryOperation storyOperation();
	
	/**
	 * <pre>
	 * īī�� �� API ȣ��
	 * </pre>
	 * @return
	 */
	TalkOperation talkOperation();
	
	/**
	 * <pre>
	 * Ǫ�� �˸� API ȣ��
	 * </pre>
	 * @return
	 * @deprecated
	 * <pre>
	 * �ش� operation ���� ��� �޼���� admin key�� ����߿� ����.
	 * user operation ���� �Ϻ� �޼���� ���� admin key �̽� �ذ��ʿ�
	 * </pre>
	 */
	@Deprecated
	PushOperation pushOperation();
}
