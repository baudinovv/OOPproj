package Communications;

import java.util.ArrayList;
import java.util.List;

public class News {

    private String title;
    private String content;
    private List<String> comments;
    private boolean priority;

    public News() {
        super();
        this.comments = new ArrayList<>();
        this.priority = false; // По умолчанию новость не является приоритетной
    }

    public News(String title, String content, boolean priority) {
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>();
        this.priority = priority;
    }

    public void addComment(String comment) {
        if (comment != null && !comment.isEmpty()) {
            comments.add(comment);
        } else {
            System.out.println("Комментарий не может быть пустым.");
        }
    }

    public List<String> getComments() {
        return new ArrayList<>(comments); // Возвращаем копию списка для защиты от модификации
    }

    public void setPriority(boolean isPriority) {
        this.priority = isPriority;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", priority=" + priority +
                ", comments=" + comments +
                '}';
    }
}
