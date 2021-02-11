package test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
        exit.setOnAction(e -> {
            // more statements
            System.exit(0);
        });
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You clicked the button.");
            }
        });
        VBox root = new VBox();
        //StackPane root = new StackPane();
        root.getChildren().addAll(btn, exit);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.show();
    }
}
