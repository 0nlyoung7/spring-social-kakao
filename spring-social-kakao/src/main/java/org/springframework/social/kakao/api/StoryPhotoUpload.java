package org.springframework.social.kakao.api;

import java.util.ArrayList;
import java.util.List;

public class StoryPhotoUpload {
	private List<String> filePathList;

	/**
	 * <pre>
	 * ���� ��� ����� �����´�.
	 * ��Ͽ� �����Ͱ� ���ٸ� null�� ��ȯ�Ѵ�.
	 * </pre>
	 * @return list or null
	 */
	public List<String> getFilePathList() {
		if (this.filePathList == null || this.filePathList.size() == 0) {
			return null;
		}
		return this.filePathList;
	}

	/**
	 * <pre>
	 * ���� ��� ��� ����
	 * 
	 * ���ε� �̹��� ũ��� 5MB ����, ������ 10�� ���Ϸ� ���ѵ˴ϴ�. ��, gif ������ 3MB ����, 1�� ���Ϸ� ���ѵ˴ϴ�.
	 * ���� ���� ���ε� ��� ���� 2�� �̻��϶� gif ������ ���ԵǾ��ִٸ� �ش� ������ ������ ������ ������ ���ε� ��󿡼� ���ܵ˴ϴ�.
	 * </pre>
	 * @param filePathList
	 */
	public void setFilePathList(List<String> filePathList) {
		this.filePathList = filePathList;
	}
	/**
	 * <pre>
	 * ���� ��� ��� list�� �����͸� �߰��Ѵ�.
	 * 
	 * filePathList ��ü�� �����͸� add �ϴ� ������� �����Ѵ�.
	 * 
	 * ���ε� �̹��� ũ��� 5MB ����, ������ 10�� ���Ϸ� ���ѵ˴ϴ�. ��, gif ������ 3MB ����, 1�� ���Ϸ� ���ѵ˴ϴ�.
	 * </pre>
	 * @param filePaths
	 */
	public void setFilePathList(String... filePaths) {
		if (this.filePathList == null) {
			this.filePathList = new ArrayList<String>();
		}
		for (String filePath : filePaths)  {
			this.filePathList.add(filePath);
		}
	}
	
	/**
	 * <pre>
	 * ���� ��� ���� (null ����)
	 * </pre>
	 */
	public void clearFilePathList() {
		this.filePathList = null;
	}
}
