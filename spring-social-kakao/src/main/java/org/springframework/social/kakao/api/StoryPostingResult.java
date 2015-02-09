package org.springframework.social.kakao.api;

import java.io.Serializable;

public class StoryPostingResult extends KakaoObject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id = "";

	/**
	 * <pre>
	 * ������ �� ���� id
	 * </pre>
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	StoryPostingResult() {}
}
