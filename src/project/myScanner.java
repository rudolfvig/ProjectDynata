package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myScanner {

    private List<File> resources;
    private final List<String> members;
    private final List<String> participation;
    private final List<String> statuses;
    private final List<String> surveys;

    public List<String> getMembers() {
        return members;
    }

    public List<String> getParticipation() {
        return participation;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public List<String> getSurveys() {
        return surveys;
    }

    public List<File> getResources() {
        return resources;
    }

    public void setResources(ArrayList<File> resources) {
        this.resources = resources;
    }

    public myScanner(String members, String participation, String statuses, String surveys)
    {
        this.resources = new ArrayList<>();
        this.members = new ArrayList<>();
        this.participation = new ArrayList<>();
        this.statuses = new ArrayList<>();
        this.surveys = new ArrayList<>();

        try {
            this.resources.add(new File(members));
            this.resources.add(new File(participation));
            this.resources.add(new File(statuses));
            this.resources.add(new File(surveys));

            Scanner scMembers = new Scanner(this.resources.get(0));
            while(scMembers.hasNext()) {
                this.members.add(scMembers.nextLine());
            }
            scMembers.close();

            Scanner scParticipation = new Scanner(this.resources.get(1));
            while(scParticipation.hasNext()) {
                this.participation.add(scParticipation.nextLine());
            }
            scParticipation.close();

            Scanner scStatuses = new Scanner(this.resources.get(2));
            while(scStatuses.hasNext()) {
                this.statuses.add(scStatuses.nextLine());
            }
            scStatuses.close();

            Scanner scSurveys = new Scanner(this.resources.get(3));
            while(scSurveys.hasNext()) {
                this.surveys.add(scSurveys.nextLine());
            }
            scSurveys.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found!!!");
            throw new RuntimeException(e);
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exeption occurd!!!");
        }
    }

    /*private void scanFile(String fileName, int resourceId){
        try {
            this.resources.add(new File(fileName));
            Scanner scanner = new Scanner(resources.get(resourceId));
            while(scanner.hasNext()) {
                this.members.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found!!!");
            throw new RuntimeException(e);
        }
    }*/

}

