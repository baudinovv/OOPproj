package Communications;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject {

    private String topic;
    private List<Researcher> participants; 
    private List<ResearchPaper> publishedPapers; 

 
    public ResearchProject(String topic) {
        super();
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }

 
    public void addParticipant(Researcher researcher) {
        if (researcher != null) {
            participants.add(researcher);
        } else {
            System.out.println("Участник не может быть null.");
        }
    }


    public void addPaper(ResearchPaper paper) {
        if (paper != null) {
            publishedPapers.add(paper);
        } else {
            System.out.println("Статья не может быть null.");
        }
    }


    public List<ResearchPaper> getPapers() {
        return new ArrayList<>(publishedPapers); 
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Researcher> getParticipants() {
        return new ArrayList<>(participants); 
    }

    public void printProjectInfo() {
        System.out.println("Тема проекта: " + topic);
        System.out.println("Участники:");
        for (Researcher researcher : participants) {
            System.out.println("- " + researcher.getName());
        }
        System.out.println("Опубликованные статьи:");
        for (ResearchPaper paper : publishedPapers) {
            System.out.println("- " + paper.getTitle());
        }
    }
}
