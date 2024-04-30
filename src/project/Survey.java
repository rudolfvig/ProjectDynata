package project;

public class Survey {
    private int surveyId;
    private String name;
    private int expectedCompletes;
    private int competitionPoints;
    private int filteredPoints;

    public Survey(String record){
        String[] values = record.split(",");
        this.surveyId = Integer.parseInt(values[0]);
        this.name = values[1];
        this.expectedCompletes = Integer.parseInt(values[2]);
        this.competitionPoints = Integer.parseInt(values[3]);
        this.filteredPoints = Integer.parseInt(values[4]);
    }

    @Override
    public String toString() {
        return "Survey{" +
                "surveyId=" + surveyId +
                ", name='" + name + '\'' +
                ", expectedCompletes=" + expectedCompletes +
                ", competitionPoints=" + competitionPoints +
                ", filteredPoints=" + filteredPoints +
                '}';
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpectedCompletes() {
        return expectedCompletes;
    }

    public void setExpectedCompletes(int expectedCompletes) {
        this.expectedCompletes = expectedCompletes;
    }

    public int getCompetitionPoints() {
        return competitionPoints;
    }

    public void setCompetitionPoints(int competitionPoints) {
        this.competitionPoints = competitionPoints;
    }

    public int getFilteredPoints() {
        return filteredPoints;
    }

    public void setFilteredPoints(int filteredPoints) {
        this.filteredPoints = filteredPoints;
    }
}
