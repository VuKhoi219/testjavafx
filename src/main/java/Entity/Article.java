package Entity;

public class Article {
    private int id;
    private String title;
    private String des;
    private String content;

    public Article(int id, String title, String des, String content) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
