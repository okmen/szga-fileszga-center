package cn.fileszga.bean.vo;
/**
 * 电子驾驶证
 * @author Mbenben
 *
 */
public class ElectronicDriverLicenseVo {
	/**
	 * 电子驾驶证
	 */
	private String electronicDriverLicense;
	/**
	 * 电子驾驶证二维码
	 */
	private String electronicDriverLicenseQRCode;
	
	public String getElectronicDriverLicense() {
		return electronicDriverLicense;
	}
	public void setElectronicDriverLicense(String electronicDriverLicense) {
		this.electronicDriverLicense = electronicDriverLicense;
	}
	public String getElectronicDriverLicenseQRCode() {
		return electronicDriverLicenseQRCode;
	}
	public void setElectronicDriverLicenseQRCode(String electronicDriverLicenseQRCode) {
		this.electronicDriverLicenseQRCode = electronicDriverLicenseQRCode;
	}

}
