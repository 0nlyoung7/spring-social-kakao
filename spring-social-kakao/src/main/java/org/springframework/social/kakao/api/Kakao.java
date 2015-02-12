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
	 */
	PushOperation pushOperation();
}
