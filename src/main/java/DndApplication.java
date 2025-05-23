import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DndApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/dnd.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Dungeons n Dragons");
        stage.setScene(scene);
        stage.show();
    }
}