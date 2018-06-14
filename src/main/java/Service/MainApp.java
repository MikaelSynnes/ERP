package Service;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApp extends Application {

    TextField passwordInput;
    TextField usernameInput;

    public TextField getUsernameInput() {
        return usernameInput;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("login");
        Label nameLabel = new Label("Username");
        Label passLabel = new Label("Password");
        usernameInput = new TextField();
        passwordInput = new TextField();
        Button submit = new Button();
        submit.setText("Login");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
            }
        });

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 4, 5);
        grid.add(passLabel, 4, 8);
        grid.add(usernameInput, 5, 5);
        grid.add(passwordInput, 5, 8);
        grid.add(submit, 5, 9);

        stage.setScene(new Scene(grid, 300, 250));
        stage.show();

    }

    public String getPassword() {
        return this.passwordInput.getText();
    }

    public String getUsername() {
        return this.usernameInput.getText();
    }

    public void setPasswordInput(String s) {
        this.passwordInput.setText(s);
    }

    public void setUsernameInput(String s) {
        this.usernameInput.setText(s);
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
        launch(args);
    }

}
