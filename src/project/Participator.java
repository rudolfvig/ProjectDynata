package project;

public class Participator {

    private int memberId;
    private int surveyId;
    private int status;
    private int length;

    public Participator(String record){
        String[] values = record.split(",");
        this.memberId = Integer.parseInt(values[0]);
        this.surveyId = Integer.parseInt(values[1]);
        this.status = Integer.parseInt(values[2]);
        this.length = Integer.parseInt(values[3]);
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
