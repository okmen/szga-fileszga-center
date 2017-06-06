package cn.fileszga.bean.studyclassroom;

public class StudyRecord {
	
	private String answerDate; //答题日期
	
	private  int isComplete; //是否完成
	
	private int  ansLogarithm; //答题对数
	

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}

	public int getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(int isComplete) {
		this.isComplete = isComplete;
	}

	public int getAnsLogarithm() {
		return ansLogarithm;
	}

	public void setAnsLogarithm(int ansLogarithm) {
		this.ansLogarithm = ansLogarithm;
	}
	

}
