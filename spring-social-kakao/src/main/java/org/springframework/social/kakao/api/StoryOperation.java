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
	
	/**
	 * <pre>
	 * �Ѱ��� �� ���丮 ���� ��������
	 * </pre>
	 * @param id
	 * @return
	 */
	MyStory myStory(String id);
	
	/**
	 * <pre>
	 * �������� �� ���丮 ���� ��������
	 * 
	 * ���� �ֱٿ� �ۼ��� �����丮 �������� ��û�ϰų� ������ ���丮���� ������ �ۼ��� �����丮 �������� ��û�� �� �ֽ��ϴ�. 
	 * �뷫 18�� ������ ������ �Ѳ����� ���� �� �ֽ��ϴ�. ������ ���̵��� �����丮�� ����� ���Ե��� �ʽ��ϴ�. (���߰��̵� ����)
	 * </pre>
	 * @param lastId null�� ���� �� ���� �ֱ��� �ͺ��� ��ȸ
	 * @return
	 */
	List<MyStory> myStories(String lastId);
	
	/**
	 * <pre>
	 * �� ���丮 �� ����
	 * </pre>
	 * @param id
	 */
	void deleteMyStory(String id);
}
