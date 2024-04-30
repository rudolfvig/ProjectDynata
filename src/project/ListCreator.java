package project;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {

    public static List<Member> createListForMembers(List<String> lines){
        List<Member> list = new ArrayList<>();
        for(int i = 1; i < lines.size(); i++){
            list.add(new Member(lines.get(i)));
        }
        return list;
    }

    public static List<Participator> createListForParticipation(List<String> lines){
        List<Participator> list = new ArrayList<>();
        for(int i = 1; i < lines.size(); i++){
            list.add(new Participator(lines.get(i)));
        }
        return list;
    }

    public static List<Survey> createListForSurvey(List<String> lines){
        List<Survey> list = new ArrayList<>();
        for(int i = 1; i < lines.size(); i++){
            list.add(new Survey(lines.get(i)));
        }
        return list;
    }

}
