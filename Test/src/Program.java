import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Name:         {ClassName}
 * Effect:         {ClassEffect}
 * Date:           5/24/2017
 * Tested:        False
 *
 * @author {Stanusoiu Mihai-Teodor}
 * @version 1.0
 */
public class Program extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Program.class.getResource("View.fxml"));

                Pane pane = (Pane)fxmlLoader.load();
                Controller controller = (Controller)fxmlLoader.getController();


            Stage stage = new Stage();
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
        }
    }
}
