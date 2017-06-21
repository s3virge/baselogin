import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by S3ViRGE on 21.06.2017.
 */
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);

        TextArea textField = new TextArea();
        textField.setMinHeight(150);
        textField.setWrapText(true);
        
        Button btnOk = new Button("OK");
        btnOk.setMinWidth(150);

        layout.getChildren().addAll(textField, btnOk);

        Scene scene = new Scene(layout, 400, 250);
        window.setScene(scene);
        window.show();
    }
}
