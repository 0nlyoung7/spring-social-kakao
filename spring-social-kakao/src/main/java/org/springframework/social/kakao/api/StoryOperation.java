package org.springframework.social.kakao.api;


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
	 * �ش� access token�� �߱޹��� ������� īī�� �̹��� ���ε� (for postNote)
	 * (������ - 2015.01.28)
	 * </pre>
	 * @param storyPhotoUpload
	 * @return
	 */
	@Deprecated
	StoryPhotoUploadResult uploadPhoto(StoryPhotoUpload storyPhotoUpload);
	
	/**
	 * <pre>
	 * �ش� access token�� �߱޹��� ������� īī�� ���丮 ���� ���� �� �ۼ�
	 * (������ - 2015.01.28)
	 * </pre>
	 * @param storyPhotoPosting
	 * @return
	 */
	@Deprecated
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
