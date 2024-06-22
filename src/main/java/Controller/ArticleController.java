package Controller;

import Entity.Article;
import Repository.MySQLrepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ArticleController implements Initializable {
    private int id;
    private String title;
    private String des;
    private String content;
    @FXML
    private TableView<Article> tableView;
    @FXML
    private TableColumn<Article, Integer> txtId;
    @FXML
    private TableColumn<Article, String> txtTitleView;
    @FXML
    private TableColumn<Article, String> txtDescriptionView;
    @FXML
    private TableColumn<Article, String> txtContentView;


    MySQLrepository mySQLrepository = new MySQLrepository();
/*    public void table_load(ActionEvent actionEvent) {
        try{
            ArrayList<Article> std = mySQLrepository.findAll();
            students = FXCollections.observableArrayList(std);
            txtId.setCellValueFactory(new PropertyValueFactory<Article, Integer>("id"));
            txtTitleView.setCellValueFactory(new PropertyValueFactory<Article,String>("title"));
            txtDescriptionView.setCellValueFactory(new PropertyValueFactory<Article,String>("des"));
            txtContentView.setCellValueFactory(new PropertyValueFactory<Article,String>("content"));
            tableView.setItems(students);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Article> articles = FXCollections.observableArrayList(mySQLrepository.findAll());
        tableView.setItems(articles);
    }
}
