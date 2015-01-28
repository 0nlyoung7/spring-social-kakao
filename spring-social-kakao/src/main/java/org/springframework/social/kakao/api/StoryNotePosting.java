package org.springframework.social.kakao.api;

public class StoryNotePosting extends AbstractStoryPosting {
	private String content = "";

	/**
	 * <pre>
	 * �����ÿ� �� ����. 
	 * ���������� 2048��. 
	 * ����ڰ� �ۼ��� ������ ���� �ְ�, �ۿ��� �־��ִ� ������ ���� �ִ�.
	 * </pre>
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <pre>
	 * �����ÿ� �� ����. 
	 * ���������� 2048��. 
	 * ����ڰ� �ۼ��� ������ ���� �ְ�, �ۿ��� �־��ִ� ������ ���� �ִ�.
	 * 
	 * 2048�ڸ� �Ѿ�� ������ �������� ������ �����͸� ���۵�.
	 * </pre>
	 * @return boolean 2048�ڸ� �Ѵ� ���� ���� �� ��� false ���ϵ�.
	 */
	public boolean setContent(String content) {
		boolean returnValue = true;
		
		if (content.length() > 2048) {
			this.content = content.substring(0, 2048);
			returnValue = false;
		} else {
			this.content = content;
		}
		
		return returnValue;
	}
}
