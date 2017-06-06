package cn.fileszga.bean.vo;
/**
 * 驾驶证
 * @author Mbenben
 *
 */
public class MyDriverLicenseVo {
	/**
	 * 档案编号
	 */
	private String fileszgaNumber;
	/**
	 * 当前状态
	 */
	private String status;
	/**
	 * 可用计分
	 */
	private String availableScore;
	/**
	 * 体检日期
	 */
	private String physicalExaminationDate;
	/**
	 * 有效日期
	 */
	private String effectiveDate;
	/**
	 * 是否已领取电子驾照 0-是，1-否
	 */
	private Integer isReceive;
	
	public String getfileszgaNumber() {
		return fileszgaNumber;
	}
	public void setfileszgaNumber(String fileszgaNumber) {
		this.fileszgaNumber = fileszgaNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAvailableScore() {
		return availableScore;
	}
	public void setAvailableScore(String availableScore) {
		this.availableScore = availableScore;
	}
	public String getPhysicalExaminationDate() {
		return physicalExaminationDate;
	}
	public void setPhysicalExaminationDate(String physicalExaminationDate) {
		this.physicalExaminationDate = physicalExaminationDate;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Integer getIsReceive() {
		return isReceive;
	}
	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	
}
