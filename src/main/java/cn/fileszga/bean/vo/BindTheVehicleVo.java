package cn.fileszga.bean.vo;
/**
 * 已绑定车辆
 * @author Mbenben
 *
 */
public class BindTheVehicleVo {
	/**
	 * 号牌号码
	 */
	private String numberPlateNumber;
	/**
	 * 号牌种类
	 */
	private String plateType;
	/**
	 * 审验/年审日期
	 */
	private String annualReviewDate;
	/**
	 * 车主姓名
	 */
	private String name;
	/**
	 * 车主身份证号码
	 */
	private String identityCard;
	/**
	 * 是否本人
	 */
	private String isMyself;
	/**
	 * 审验/年审日期提醒
	 */
	private String annualReviewDateRemind;
	/**
	 * 手机号
	 */
	private String mobilephone;
	/**
	 * 未处理违法数量
	 */
	private Integer illegalNumber;
	/**
	 * 车辆是否有其他人使用
	 */
	private String otherPeopleUse;
	
	public String getNumberPlateNumber() {
		return numberPlateNumber;
	}
	public void setNumberPlateNumber(String numberPlateNumber) {
		this.numberPlateNumber = numberPlateNumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getAnnualReviewDate() {
		return annualReviewDate;
	}
	public void setAnnualReviewDate(String annualReviewDate) {
		this.annualReviewDate = annualReviewDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getIsMyself() {
		return isMyself;
	}
	public void setIsMyself(String isMyself) {
		this.isMyself = isMyself;
	}
	public String getAnnualReviewDateRemind() {
		return annualReviewDateRemind;
	}
	public void setAnnualReviewDateRemind(String annualReviewDateRemind) {
		this.annualReviewDateRemind = annualReviewDateRemind;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public Integer getIllegalNumber() {
		return illegalNumber;
	}
	public void setIllegalNumber(Integer illegalNumber) {
		this.illegalNumber = illegalNumber;
	}
	public String getOtherPeopleUse() {
		return otherPeopleUse;
	}
	public void setOtherPeopleUse(String otherPeopleUse) {
		this.otherPeopleUse = otherPeopleUse;
	}
}
