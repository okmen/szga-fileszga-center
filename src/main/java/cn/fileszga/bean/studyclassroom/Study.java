package cn.fileszga.bean.studyclassroom;

import java.io.Serializable;
import java.util.List;

public class Study implements Serializable {
	
	private String classroomId; //列表ID
	
	private String userName; //用户名称
	
	private String drive; //用户行驶证
	
	private String identityCard; //用户身份证
	
	private String scoreStartDate; //计分开始周期
	
	private String scoreEndDate; //积分结束周期
	
	private int integral; //用户积分
	
	private List<StudyRecord> studyRecord; //学习记录0到多条
	
	private String answerDate; //答题时间
	
	private int isComplete;
	
	private String ansLogarithm;
	
	
	private int subjectId; //取题编号
	
	private String subjectName;//题目名称
	
	private int subjecttype; //取题类型  1代表文字类型,2代表图片类型
	
	private int testQuestionsType; //试题类型   1判断题，2选择题
	
	private String subjectImg; //题目图片路径 
	
	//private String subjectAnswer;//答案选项
	
	private String answerTime;//答题时间
	
	private int answererror;//答题错数
	
	private int surplusAnswe;//剩余题数
	
	private int answerState; //答题状态  0代表当天无法再次进行消分学习 	1可以答题	2代表今天消分学习已答对10题，请明天继续
	
	private List<Answeroptions> answeroptions; //答案选项
	
	private String subjectAnswer; //答题答案
	private int answerCount; //答题总数
	private int answerCorrect;//答对题数
	

	public String getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(String classroomId) {
		this.classroomId = classroomId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getScoreStartDate() {
		return scoreStartDate;
	}

	public void setScoreStartDate(String scoreStartDate) {
		this.scoreStartDate = scoreStartDate;
	}

	public String getScoreEndDate() {
		return scoreEndDate;
	}

	public void setScoreEndDate(String scoreEndDate) {
		this.scoreEndDate = scoreEndDate;
	}



	
	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}



	public String getAnsLogarithm() {
		return ansLogarithm;
	}

	public void setAnsLogarithm(String ansLogarithm) {
		this.ansLogarithm = ansLogarithm;
	}

	

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public int getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(int isComplete) {
		this.isComplete = isComplete;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjecttype() {
		return subjecttype;
	}

	public void setSubjecttype(int subjecttype) {
		this.subjecttype = subjecttype;
	}

	public int getTestQuestionsType() {
		return testQuestionsType;
	}

	public void setTestQuestionsType(int testQuestionsType) {
		this.testQuestionsType = testQuestionsType;
	}

	public String getSubjectImg() {
		return subjectImg;
	}

	public void setSubjectImg(String subjectImg) {
		this.subjectImg = subjectImg;
	}


	public String getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}

	public int getAnswererror() {
		return answererror;
	}

	public void setAnswererror(int answererror) {
		this.answererror = answererror;
	}

	public int getSurplusAnswe() {
		return surplusAnswe;
	}

	public void setSurplusAnswe(int surplusAnswe) {
		this.surplusAnswe = surplusAnswe;
	}

	public int getAnswerState() {
		return answerState;
	}

	public void setAnswerState(int answerState) {
		this.answerState = answerState;
	}

	public List<Answeroptions> getAnsweroptions() {
		return answeroptions;
	}

	public void setAnsweroptions(List<Answeroptions> answeroptions) {
		this.answeroptions = answeroptions;
	}

	public String getSubjectAnswer() {
		return subjectAnswer;
	}

	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}

	public int getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}

	public int getAnswerCorrect() {
		return answerCorrect;
	}

	public void setAnswerCorrect(int answerCorrect) {
		this.answerCorrect = answerCorrect;
	}

	public List<StudyRecord> getStudyRecord() {
		return studyRecord;
	}

	public void setStudyRecord(List<StudyRecord> studyRecord) {
		this.studyRecord = studyRecord;
	}

}
