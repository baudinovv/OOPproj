package Communications;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResearchPapers {

    private int paperId;
    private String title;
    private List<Researcher> authors;
    private Date publishDate;
    private List<String> citations;

    public ResearchPapers() {
        super();
        this.authors = new ArrayList<>();
        this.citations = new ArrayList<>();
        this.publishDate = new Date(); // Устанавливаем текущую дату по умолчанию
    }

    public ResearchPapers(int paperId, String title, List<Researcher> authors, Date publishDate, List<String> citations) {
        this.paperId = paperId;
        this.title = title;
        this.authors = authors != null ? authors : new ArrayList<>();
        this.publishDate = publishDate;
        this.citations = citations != null ? citations : new ArrayList<>();
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Researcher> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Researcher> authors) {
        this.authors = authors;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public List<String> getCitations() {
        return citations;
    }

    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    public void printPaper() {
        System.out.println("ID статьи: " + paperId);
        System.out.println("Заголовок: " + title);
        System.out.println("Авторы: " + authors);
        System.out.println("Дата публикации: " + publishDate);
        System.out.println("Цитирования: " + citations);
    }

    public String plainTextCitation() {
        StringBuilder citation = new StringBuilder();
        for (Researcher author : authors) {
            citation.append(author.getName()).append(", ");
        }
        if (!authors.isEmpty()) {
            citation.setLength(citation.length() - 2); // Убираем лишнюю запятую
        }
        citation.append(". ").append(title).append(". ").append(publishDate);
        return citation.toString();
    }

    public String bibtexCitation() {
        StringBuilder citation = new StringBuilder();
        citation.append("@article{").append(paperId).append(",\n");
        citation.append("  title = {").append(title).append("},\n");
        citation.append("  author = {");
        for (Researcher author : authors) {
            citation.append(author.getName()).append(" and ");
        }
        if (!authors.isEmpty()) {
            citation.setLength(citation.length() - 5); // Убираем лишнее " and "
        }
        citation.append("},\n");
        citation.append("  year = {").append(publishDate.getYear() + 1900).append("}\n");
        citation.append("}");
        return citation.toString();
    }

    public String getCitation() {
        return String.join("\n", citations);
    }
}
