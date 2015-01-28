package org.springframework.social.kakao.api;

import java.util.List;


public interface StoryOperation {
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 ��� ���� Ȯ��
	 * </pre>
	 * @return
	 */
	KakaoStoryProfile isStoryUser();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 ������ ���� ��ȸ
	 * </pre>
	 * @return
	 */
	KakaoStoryProfile getUserProfile();
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 �� �ۼ�
	 * </pre>
	 * @param storyNotePosting
	 * @return
	 */
	StoryPostingResult postNote(StoryNotePosting storyNotePosting);
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� �̹��� ���ε� (for postPhoto)
	 * </pre>
	 * @param storyPhotoUpload
	 * @return
	 */
	List<String> uploadPhoto(StoryPhotoUpload storyPhotoUpload);
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 ���� ���� �� �ۼ�
	 * </pre>
	 * @param storyPhotoPosting
	 * @return
	 */
	StoryPostingResult postPhoto(StoryPhotoPosting storyPhotoPosting);
	
	/**
	 * <pre>
	 * �ܺ� ��ũ ���� �������� (link ������ ������ Ȱ��)
	 * </pre>
	 * @param uri
	 * @return
	 */
	StoryLinkInfo linkInfo(String url);
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 �ܺ� ������ ��ũ ���� �� �ۼ�
	 * </pre>
	 * @param storyLinkData
	 * @return
	 */
	StoryPostingResult postLink(StoryLinkPosting storyLinkPosting);
}
