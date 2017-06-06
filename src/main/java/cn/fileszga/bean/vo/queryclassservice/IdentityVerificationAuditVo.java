package cn.fileszga.bean.vo.queryclassservice;
/**
 * 身份认证审核
 * @author Mbenben
 *
 */
public class IdentityVerificationAuditVo {
	/**
	 * 信息登记时间
	 */
	private String informationRegistrationTime;
	/**
	 * 当前状态
	 */
	private String currentState;
	/**
	 * 认证类型
	 */
	private String authenticationType;
	/**
	 * 流水号
	 */
	private String serialNumber;
	/**
	 * 业务类型
	 */
	private Integer businessType;
	
	public String getInformationRegistrationTime() {
		return informationRegistrationTime;
	}
	public void setInformationRegistrationTime(String informationRegistrationTime) {
		this.informationRegistrationTime = informationRegistrationTime;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

}
