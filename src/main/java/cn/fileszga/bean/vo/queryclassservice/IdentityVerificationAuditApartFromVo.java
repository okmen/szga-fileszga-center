package cn.fileszga.bean.vo.queryclassservice;
/**
 * 除了身份认证审核其他
 * @author Mbenben
 *
 */
public class IdentityVerificationAuditApartFromVo {
	/**
	 * 业务类型
	 */
	private String numberPlateNumber;
	/**
	 * 号牌号码
	 */
	private String plateType;
	/**
	 * 号牌种类
	 */
	private String approvalStatus;
	/**
	 * 审核状态
	 */
	private String reasonForWithdrawal;
	/**
	 * 退办原因
	 */
	private Integer businessType;
	
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
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getReasonForWithdrawal() {
		return reasonForWithdrawal;
	}
	public void setReasonForWithdrawal(String reasonForWithdrawal) {
		this.reasonForWithdrawal = reasonForWithdrawal;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	
}
