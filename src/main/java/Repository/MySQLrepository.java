package Repository;

import Entity.Article;
import Entity.Article;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MySQLrepository {
    private final String MYSQL_CONNECTION= "jdbc:mysql://localhost:3306/article";
    private final String MYSQL_USERNAME= "root";
    private final String MYSQL_PASSWORD= "";

    public ArrayList<Article> findAll() {
        ArrayList<Article> arrayList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(MYSQL_CONNECTION, MYSQL_USERNAME, MYSQL_PASSWORD)) {
            String sql = "Select * from articles1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("Title");
                String description = rs.getString("describe1");
                String content = rs.getString("Content");
                Article article = new Article(id, title, description, content);
                arrayList.add(article);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
/*    public void display() {
        ArrayList<Article> arrayList = findAll();
        for (Article article : arrayList) {
            System.out.println("Title: " + article.getTitle());
            System.out.println("describe1" + article.getDes());
            System.out.println("Content: " + article.getContent());
        }
    }
    public static void main(String[] args) {
        MySQLrepository mySQLrepository = new MySQLrepository();
        mySQLrepository.display();
    }*/
}
