package cn.fileszga.bean.vo;
/**
 * 身份认证审核结果
 * @author Mbenben
 *
 */
public class IdentityVerificationAuditResultsVo {
	/**
	 * 状态  0-待审核、1-审核通过、tb-退办
	 */
	private Integer status;
	/**
	 * 退办原因
	 */
	private String retirementResult;
	/**
	 * 审核日期
	 */
	private String reviewDate;
	/**
	 * 认证类型 	1-车主本人、2-非车主本人、3-驾驶人
	 */
	private Integer authenticationType;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRetirementResult() {
		return retirementResult;
	}
	public void setRetirementResult(String retirementResult) {
		this.retirementResult = retirementResult;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public Integer getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(Integer authenticationType) {
		this.authenticationType = authenticationType;
	}
	
	
	
}
