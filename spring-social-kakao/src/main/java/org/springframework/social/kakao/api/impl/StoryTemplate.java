package org.springframework.social.kakao.api.impl;

import java.util.List;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.social.kakao.api.AbstractStoryPosting;
import org.springframework.social.kakao.api.KakaoStoryProfile;
import org.springframework.social.kakao.api.MyStory;
import org.springframework.social.kakao.api.StoryLinkInfo;
import org.springframework.social.kakao.api.StoryLinkPosting;
import org.springframework.social.kakao.api.StoryNotePosting;
import org.springframework.social.kakao.api.StoryOperation;
import org.springframework.social.kakao.api.StoryPhotoPosting;
import org.springframework.social.kakao.api.StoryPhotoUpload;
import org.springframework.social.kakao.api.StoryPostingResult;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
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
	
	public StoryPostingResult postNote(StoryNotePosting storyNotePosting) {
		requireAuthorization();
		//�Ķ���� �����ϱ�
		MultiValueMap<String, Object> param = postingCommonParamSetting(storyNotePosting);
		param.set("content", storyNotePosting.getContent());
		
		//API ��û
		return restTemplate.postForObject(buildApiUri("/v1/api/story/post/note"), param, StoryPostingResult.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> uploadPhoto(StoryPhotoUpload storyPhotoUpload) {
		List<String> filePathList = storyPhotoUpload.getFilePathList();
		
		MultiValueMap<String, FileSystemResource> param = new LinkedMultiValueMap<String, FileSystemResource>();
		for (String filePath : filePathList) {
			param.add("file", new FileSystemResource(filePath));
		}
		
		return restTemplate.postForObject(buildApiUri("/v1/api/story/upload/multi"), param, List.class);
	}
	
	public StoryPostingResult postPhoto(StoryPhotoPosting storyPhotoPosting) {
		requireAuthorization();
		if (storyPhotoPosting.getStoryPhotoUpload() != null) {
			//�̹��� ���ε� ȣ���Ͽ� ��� ��ü
			List<String> imageUrlList = uploadPhoto(storyPhotoPosting.getStoryPhotoUpload());
			storyPhotoPosting.setImageUrlList(imageUrlList);
		}
		
		MultiValueMap<String, Object> param = postingCommonParamSetting(storyPhotoPosting);
		param.set("image_url_list", storyPhotoPosting.imageUrlListToJson(false));
		param.set("content", storyPhotoPosting.getContent());
		
		return restTemplate.postForObject(buildApiUri("/v1/api/story/post/photo"), param, StoryPostingResult.class);
	}
	
	public StoryLinkInfo linkInfo(String url) {
		requireAuthorization();
		MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		param.set("url", url);
		
		return restTemplate.getForObject(buildApiUri("/v1/api/story/linkinfo", param), StoryLinkInfo.class);
	}

	public StoryPostingResult postLink(StoryLinkPosting storyLinkPosting) {
		requireAuthorization();
		//url ���� üũ. url ���� �ִٸ� linkInfo �޼��� ȣ��
		if (!StringUtils.isEmpty(storyLinkPosting.getUrl())) {
			storyLinkPosting.setStoryLinkInfo(linkInfo(storyLinkPosting.getUrl()));
		}
		
		//�Ķ���� ����
		MultiValueMap<String, Object> param = postingCommonParamSetting(storyLinkPosting);
		param.set("link_info", storyLinkPosting.getStoryLinkInfo().toJsonString(false));
		param.set("content", storyLinkPosting.getContent());
		
		return restTemplate.postForObject(buildApiUri("/v1/api/story/post/link"), param, StoryPostingResult.class);
	}
	
	private MultiValueMap<String, Object> postingCommonParamSetting(AbstractStoryPosting abstractStoryPosting) {
		MultiValueMap<String, Object> param = new LinkedMultiValueMap<String, Object>();
		
		param.set("permission", abstractStoryPosting.getPermission());
		param.set("enable_share", abstractStoryPosting.isEnableShare());
		if (!StringUtils.isEmpty(abstractStoryPosting.getAndroidExecParam())) {
			param.set("android_exec_param", abstractStoryPosting.getAndroidExecParam());
		}
		if (!StringUtils.isEmpty(abstractStoryPosting.getIosExecParam())) {
			param.set("ios_exec_param", abstractStoryPosting.getIosExecParam());
		}
		if (!StringUtils.isEmpty(abstractStoryPosting.getAndroidMarketParam())) {
			param.set("android_market_param", abstractStoryPosting.getAndroidMarketParam());
		}
		if (!StringUtils.isEmpty(abstractStoryPosting.getIosMarketParam())) {
			param.set("ios_market_param", abstractStoryPosting.getIosMarketParam());
		}
		
		return param;
	}
	
	public MyStory myStory(String id) {
		MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		param.set("id", id);
		
		return restTemplate.getForObject(buildApiUri("/v1/api/story/mystory", param), MyStory.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<MyStory> myStories(String lastId) {
		MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		if (lastId != null) {
			param.set("last_id", lastId);
		}
		
		return restTemplate.getForObject(buildApiUri("/v1/api/story/mystories", param), List.class);
	}
	
	public void deleteMyStory(String id) {
		MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		param.set("id", id);
		
		restTemplate.delete(buildApiUri("/v1/api/story/delete/mystory", param));
	}
}
