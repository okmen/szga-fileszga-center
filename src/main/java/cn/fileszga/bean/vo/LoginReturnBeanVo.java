package cn.fileszga.bean.vo;

/**
 * 登录返回的对象
 * @author Mbenben
 *
 */
public class LoginReturnBeanVo {
	/**
	 * 认证基本信息
	 */
	private AuthenticationBasicInformationVo authenticationBasicInformation;
	/**
	 * 认证基本信息
	 */
	private IdentityVerificationAuditResultsVo identityVerificationAuditResults;
	public AuthenticationBasicInformationVo getAuthenticationBasicInformation() {
		return authenticationBasicInformation;
	}
	public void setAuthenticationBasicInformation(AuthenticationBasicInformationVo authenticationBasicInformation) {
		this.authenticationBasicInformation = authenticationBasicInformation;
	}
	public IdentityVerificationAuditResultsVo getIdentityVerificationAuditResults() {
		return identityVerificationAuditResults;
	}
	public void setIdentityVerificationAuditResults(IdentityVerificationAuditResultsVo identityVerificationAuditResults) {
		this.identityVerificationAuditResults = identityVerificationAuditResults;
	}
	
}
