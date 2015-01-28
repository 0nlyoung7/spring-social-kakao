package org.springframework.social.kakao.api;

import java.util.ArrayList;
import java.util.List;

public class StoryPhotoPosting extends StoryNotePosting {
	private StoryPhotoUpload storyPhotoUpload;
	private List<String> imageUrlList;

	/**
	 * <pre>
	 * ��ϴ�� �̹��� ������ �����´�
	 * </pre>
	 * @return
	 */
	public StoryPhotoUpload getStoryPhotoUpload() {
		if (this.storyPhotoUpload != null && this.storyPhotoUpload.getFilePathList() == null) {
				return null;
		}
		return storyPhotoUpload;
	}
	/**
	 * <pre>
	 * ����ϰ��� �ϴ� �̹��� ������ �����Ѵ�.
	 * �ش� �����Ͱ� ���� �Ѵٸ� 2�ܰ��� ���μ����� �����ϰ� �ȴ�.
	 * 
	 * STEP 1. ���� ���ε� API ȣ��
	 * STEP 2. �̹��� ������ API ȣ��
	 * </pre>
	 * @param storyPhotoUpload
	 */
	public void setStoryPhotoUpload(StoryPhotoUpload storyPhotoUpload) {
		this.storyPhotoUpload = storyPhotoUpload;
	}
	
	/**
	 * <pre>
	 * ������ �Ǵ� �ۿ� �ԷµǴ� �̹��� URL ����� �����´�.
	 * 
	 * ���丮 �����ÿ� ������ �̹��� URL�� ���� �� �� �����ϴ�. �ݵ�� ���ε� API�� �̿��Ͽ� ���ε��� �̹����� ����� �� �ֽ��ϴ�. - ���߰��̵� ����
	 * </pre>
	 * @return
	 */
	public List<String> getImageUrlList() {
		return imageUrlList;
	}
	/**
	 * <pre>
	 * ������ �Ǵ� �ۿ� ���Ե� �̹��� URL ��� ����
	 * </pre>
	 * @param imageUrlList
	 */
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}
	/**
	 * <pre>
	 * �����õǴ� �ۿ� ���Ե� �̹��� URL��Ͽ� �����͸� �߰��Ѵ�.
	 * 
	 * imageUrlList ��ü�� �����͸� add �ϴ� ������� �����Ѵ�.
	 * </pre>
	 * @param imageUrls
	 */
	public void setImageUrlList(String... imageUrls) {
		if (this.imageUrlList == null) {
			this.imageUrlList = new ArrayList<String>();
		}
		
		for (String imageUrl : imageUrls) {
			this.imageUrlList.add(imageUrl);
		}
	}
	/**
	 * <pre>
	 * �̹��� URL ��� ����
	 * </pre>
	 */
	public void clearImageUrlList() {
		this.imageUrlList = null;
	}
	
	
}
