package org.springframework.social.kakao.api;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StoryLinkInfo {
	private String url;
	private String requested_url;
	private String host;
	private String title;
	private List<String> image;
	private String description;
	private String section;
	private String site_name;
	
	/**
	 * <pre>
	 * ��ũ�� �� �ּ��� URL. shorten URL�� ��� resolution�� ���� URL
	 * </pre>
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * <pre>
	 * ��û���� URL ����. resolution�� �ϱ� ���� URL
	 * </pre>
	 * @return
	 */
	public String getRequested_url() {
		return requested_url;
	}
	/**
	 * <pre>
	 * ��û�� �ּ��� Host ��
	 * </pre>
	 * @return
	 */
	public String getHost() {
		return host;
	}
	/**
	 * <pre>
	 * �������� Ÿ��Ʋ
	 * </pre>
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * <pre>
	 * �ش� �� �������� ��ǥ �̹��� �ּ�. �ִ� 3��.
	 * </pre>
	 * @return
	 */
	public List<String> getImage() {
		return image;
	}
	/**
	 * <pre>
	 * �ش� �� �������� ����
	 * </pre>
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * <pre>
	 * �ش� �� �������� ���� ����
	 * </pre>
	 * @return
	 */
	public String getSection() {
		return section;
	}
	/**
	 * <pre>
	 * �ش� �� ����Ʈ �̸�
	 * </pre>
	 * @return
	 */
	public String getSite_name() {
		return site_name;
	}
	
	/**
	 * <pre>
	 * Json string ���·� �����͸� ��ȯ�Ѵ�.
	 * </pre>
	 * @param prettyPrint
	 * @return
	 */
	public String toJsonString(boolean prettyPrint) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			if (prettyPrint) {
				return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
			} else {
				return objectMapper.writeValueAsString(this);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}

	StoryLinkInfo(){}
}
