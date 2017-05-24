import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Name:         {ClassName}
 * Effect:         {ClassEffect}
 * Date:           5/24/2017
 * Tested:        False
 *
 * @author {Stanusoiu Mihai-Teodor}
 * @version 1.0
 */
public class Controller {
    @FXML @FirstAnnotation
    public Button firstButton;
    @FXML @SecondAnnotation
    public Button secondButton;

    Manager manager;

    public Controller() {}

    public boolean function() {
        return true;
    }

    @FXML
    public void initialize() {
        manager = new Manager(this);
    }
}
