package org.springframework.social.kakao.api;

public class AbstractStoryPosting extends KakaoObject {
	private String permission = "A";
	private String enableShare = "true"; //īī�� API ���۷������� �⺻�� false��� �ϳ� ���� ������ default����  A(��ü ����)�̹Ƿ� default���� true ������. 
	private String androidExecParam = "";
	private String iosExecParam = "";
	private String androidMarketParam = "";
	private String iosMarketParam = "";
	
	/**
	 * <pre>
	 * ������ �� ���丮�� ��ü �������� ģ�� �������� ����.
	 * </pre>
	 * @return
	 */
	public String getPermission() {
		return permission;
	}
	/**
	 * <pre>
	 * ������ �� ���丮�� ��ü �������� ģ�� �������� ����.
	 * F : ģ�����Ը� ����, A : ��ü ����, M : ���� ����
	 * �⺻���� A.
	 * 
	 * ��ü ������ ���� �� ��� �ڵ����� ���� ���ɿ��ΰ� true�� �����.
	 * ��ü ���� ���� �� �ٸ� �������� ���� �� ���� ���ɿ� ���� ���� Ȯ�� �ʿ�.
	 * </pre>
	 * @return
	 */
	public void setPermission(String permission) {
		this.permission = permission;
		if (this.permission.equals("A")) {
			this.enableShare = "true";
		}
	}
	
	/**
	 * <pre>
	 * ģ�� �����ÿ� ģ���� �ش��������� ������ �� �ִ��� ����.
	 * </pre>
	 * @return true or false
	 */
	public String isEnableShare() {
		return enableShare;
	}
	/**
	 * <pre>
	 * ģ�� �����ÿ� ģ���� �ش��������� ������ �� �ִ��� ����. 
	 * ��ü ������ ���� �������� ���úҰ�. ������ ��������. 
	 * �⺻���� false.
	 * 
	 * �� ���� ���� ������ A(��ü ����)�� �����Ǿ��ִٸ� ������ true ����
	 * </pre>
	 * @param enableShare
	 */
	public void setEnableShare(boolean enableShare) {
		if (this.permission.equals("A")) {
			enableShare = true;
		}
		
		if (enableShare) {
			this.enableShare = "true";
		} else {
			this.enableShare = "false";
		}
	}
	
	/**
	 * <pre>
	 * Android �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * </pre>
	 * @return
	 */
	public String getAndroidExecParam() {
		return androidExecParam;
	}
	/**
	 * <pre>
	 * Android �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * �⺻ URL "kakao[appkey]://kakaostory" �ڿ� �Ķ���ͷ� �ٰ� �ȴ�.
	 * 
	 * �⺻���� emtpty string���� null �Ǵ� empty �ϰ�� �ش� ������ api ��û �Ķ���Ϳ� ���Ե��� ����.
	 * </pre>
	 * @return
	 */
	public void setAndroidExecParam(String androidExecParam) {
		this.androidExecParam = androidExecParam;
	}
	
	/**
	 * <pre>
	 * iOS �� ���� URL�� ���� �ٿ��� �Ķ����. 
	 * </pre>
	 * @param iosExecParam
	 */
	public String getIosExecParam() {
		return iosExecParam;
	}
	/**
	 * <pre>
	 * iOS �� ���� URL�� ���� �ٿ��� �Ķ����. 
	 * �⺻ URL "kakao[appkey]://kakaostory" �ڿ� �Ķ���ͷ� �ٰ� �ȴ�.
	 * 
	 * �⺻���� emtpty string���� null �Ǵ� empty �ϰ�� �ش� ������ api ��û �Ķ���Ϳ� ���Ե��� ����.
	 * </pre>
	 * @param iosExecParam
	 */
	public void setIosExecParam(String iosExecParam) {
		this.iosExecParam = iosExecParam;
	}
	
	/**
	 * <pre>
	 * Android �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * </pre>
	 * @return
	 */
	public String getAndroidMarketParam() {
		return androidMarketParam;
	}
	/**
	 * <pre>
	 * Android �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * �⺻ URL "market://details?id=[android package name]" �ڿ� �Ķ���ͷ� �ٰ� �ȴ�.
	 * 
	 * �⺻���� emtpty string���� null �Ǵ� empty �ϰ�� �ش� ������ api ��û �Ķ���Ϳ� ���Ե��� ����.
	 * </pre>
	 * @return
	 */
	public void setAndroidMarketParam(String androidMarketParam) {
		this.androidMarketParam = androidMarketParam;
	}
	
	/**
	 * <pre>
	 * iOS �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * </pre>
	 * @return
	 */
	public String getIosMarketParam() {
		return iosMarketParam;
	}
	/**
	 * <pre>
	 * iOS �� ���� URL�� ���� �ٿ��� �Ķ����.
	 * �⺻ URL "https://itunes.apple.com/app/id[�۽���� ID]" �ڿ� �Ķ���ͷ� �ٰ� �ȴ�.
	 * 
	 * �⺻���� emtpty string���� null �Ǵ� empty �ϰ�� �ش� ������ api ��û �Ķ���Ϳ� ���Ե��� ����.
	 * </pre>
	 * @return
	 */
	public void setIosMarketParam(String iosMarketParam) {
		this.iosMarketParam = iosMarketParam;
	}
}
