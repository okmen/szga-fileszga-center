package cn.fileszga.bean.vo;

import java.util.List;
/**
 * 机动车信息单
 * @author Mbenben
 *
 */
public class MotorVehicleInformationSheetVo {
	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 身份证号
	 */
	private String identityCard;
	/**
	 * 联系电话
	 */
	private String mobilephone;
	/**
	 * 车牌核发省简称
	 */
	private String provinceAbbreviation;
	/**
	 * 号牌号码
	 */
	private List<String> numberPlateNumbers;
	/**
	 * 车辆类型
	 */
	private List<String> plateTypes;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getProvinceAbbreviation() {
		return provinceAbbreviation;
	}
	public void setProvinceAbbreviation(String provinceAbbreviation) {
		this.provinceAbbreviation = provinceAbbreviation;
	}
	public List<String> getNumberPlateNumbers() {
		return numberPlateNumbers;
	}
	public void setNumberPlateNumbers(List<String> numberPlateNumbers) {
		this.numberPlateNumbers = numberPlateNumbers;
	}
	public List<String> getPlateTypes() {
		return plateTypes;
	}
	public void setPlateTypes(List<String> plateTypes) {
		this.plateTypes = plateTypes;
	}
	
}
