package cn.fileszga.bean.vo;
/**
 * 电子行驶证
 * @author Mbenben
 *
 */
public class DrivingLicenseVo {
	/**
	 * 车主姓名
	 */
	private String electronicDriverLicense;
	/**
	 * 是否为本人 1-是、0-否
	 */
	private String isOwnerName;
	/**
	 * 电子行驶证
	 */
	private String electronicDrivingLicense;
	/**
	 * 电子行驶证二维码
	 */
	private String electronicDrivingLicenseQRCode;
	
	public String getElectronicDriverLicense() {
		return electronicDriverLicense;
	}
	public void setElectronicDriverLicense(String electronicDriverLicense) {
		this.electronicDriverLicense = electronicDriverLicense;
	}
	
	public String getIsOwnerName() {
		return isOwnerName;
	}
	public void setIsOwnerName(String isOwnerName) {
		this.isOwnerName = isOwnerName;
	}
	public String getElectronicDrivingLicense() {
		return electronicDrivingLicense;
	}
	public void setElectronicDrivingLicense(String electronicDrivingLicense) {
		this.electronicDrivingLicense = electronicDrivingLicense;
	}
	public String getElectronicDrivingLicenseQRCode() {
		return electronicDrivingLicenseQRCode;
	}
	public void setElectronicDrivingLicenseQRCode(String electronicDrivingLicenseQRCode) {
		this.electronicDrivingLicenseQRCode = electronicDrivingLicenseQRCode;
	}
	
}
