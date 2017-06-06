package cn.fileszga.bean.vo;
/**
 * 认证基本信息
 * @author Mbenben
 *
 */
public class AuthenticationBasicInformationVo {
	/**
	 * 真实姓名
	 */
	private String trueName;
	/**
	 * 手机号
	 */
	private String mobilephone;
	/**
	 * 我的身份证
	 */
	private String identityCard;
	/**
	 * 我的车牌号
	 */
	private String myNumberPlate;
	/**
	 * 我的头像
	 */
	private String myAvatar;
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMyNumberPlate() {
		return myNumberPlate;
	}
	public void setMyNumberPlate(String myNumberPlate) {
		this.myNumberPlate = myNumberPlate;
	}
	public String getMyAvatar() {
		return myAvatar;
	}
	public void setMyAvatar(String myAvatar) {
		this.myAvatar = myAvatar;
	}

}
