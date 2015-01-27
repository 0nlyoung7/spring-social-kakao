package org.springframework.social.kakao.api.impl;

import org.springframework.social.kakao.api.KakaoStoryProfile;
import org.springframework.social.kakao.api.StoryLinkData;
import org.springframework.social.kakao.api.StoryOperation;
import org.springframework.web.client.RestTemplate;

public class StoryTemplate extends AbstractKakaoOperations implements StoryOperation {
	private final RestTemplate restTemplate;
	
	public StoryTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
	}

	public KakaoStoryProfile isStoryUser() {
		requireAuthorization();
		return restTemplate.getForObject(buildApiUri("/v1/api/story/isstoryuser"), KakaoStoryProfile.class);
	}

	public KakaoStoryProfile getUserProfile() {
		requireAuthorization();
		return restTemplate.getForObject(buildApiUri("/v1/api/story/profile"), KakaoStoryProfile.class);
	}

	public void postLink(StoryLinkData storyLinkData) {
		requireAuthorization();
		//�����ؾ��ϸ� 2�������� ����Ǿ���� (��ũ ��������� ���� �������� -> īī�� ���丮�� ��ũ �����ϱ�)
	}
}
