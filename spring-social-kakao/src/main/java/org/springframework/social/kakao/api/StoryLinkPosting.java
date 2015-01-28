package org.springframework.social.kakao.api;

public class StoryLinkPosting extends StoryNotePosting {
	private StoryLinkInfo storyLinkInfo;
	private String url;

	/**
	 * <pre>
	 * linkinfo api�� ����Ͽ� ��ȸ�� ����Ʈ ����
	 * </pre>
	 * @return
	 */
	public StoryLinkInfo getStoryLinkInfo() {
		return storyLinkInfo;
	}
	/**
	 * <pre>
	 * linkinfo api�� ����Ͽ� ��ȸ�� ����Ʈ ����
	 * 
	 * ���� url���� �����Ͽ� posLink operation �� ȣ���Ѵٸ� �ش� ��ü�� ���õ�.
	 * </pre>
	 * @param storyLinkInfo
	 */
	public void setStoryLinkInfo(StoryLinkInfo storyLinkInfo) {
		this.storyLinkInfo = storyLinkInfo;
	}
	
	/**
	 * <pre>
	 * ��ũ�ϰ��� �ϴ� �ܺ� ����Ʈ url
	 * </pre>
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * <pre>
	 * ��ũ�ϰ��� �ϴ� �ܺ� ����Ʈ url
	 * 
	 * �ش� �����Ͱ� ���� �Ǿ� �ִٸ� linkinfo api�� ȣ���Ͽ� ��ȯ���� ���� �����.
	 * (storyLinkInfo ��ü�� ���õ� �׸�� ���õ�)
	 * </pre>
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
