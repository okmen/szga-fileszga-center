package cn.fileszga.bean.vo.queryclassservice;
/**
 * 预约查询
 * @author Mbenben
 *
 */
public class MakeAnAppointmentVo {
	/**
	 * 业务类型
	 */
	private String businessType;
	/**
	 * 车主姓名
	 */
	private String userName;
	/**
	 * 身份证号
	 */
	private String identityCard;
	/**
	 * 手机号码
	 */
	private String mobilephone;
	/**
	 * 预约地点
	 */
	private String placeOfAppointment;
	/**
	 * 预约日期
	 */
	private String placeOfDate;
	/**
	 * 预约时间
	 */
	private String placeOfTime;
	/**
	 * 号牌号码
	 */
	private String numberPlateNumber;
	/**
	 * 车辆类型
	 */
	private String vehicleType;
	/**
	 * 预约状态
	 */
	private String reservationStatus;
	
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
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
	public String getPlaceOfAppointment() {
		return placeOfAppointment;
	}
	public void setPlaceOfAppointment(String placeOfAppointment) {
		this.placeOfAppointment = placeOfAppointment;
	}
	public String getPlaceOfDate() {
		return placeOfDate;
	}
	public void setPlaceOfDate(String placeOfDate) {
		this.placeOfDate = placeOfDate;
	}
	public String getPlaceOfTime() {
		return placeOfTime;
	}
	public void setPlaceOfTime(String placeOfTime) {
		this.placeOfTime = placeOfTime;
	}
	public String getNumberPlateNumber() {
		return numberPlateNumber;
	}
	public void setNumberPlateNumber(String numberPlateNumber) {
		this.numberPlateNumber = numberPlateNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	
}
