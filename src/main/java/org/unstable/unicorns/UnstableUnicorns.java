package org.unstable.unicorns;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;

import org.unstable.unicorns.internal.events.ButtonEvent;

public class UnstableUnicorns extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/org/unstable/unicorns/fxml/GameFXML.fxml"));
        Scene gameScene = new Scene(root);
        stage.setScene(gameScene);
        //stage.setResizable(false);
        stage.setTitle("Unstable Unicorns");

        Stage startStage = new Stage();
        Parent startScreen = FXMLLoader.load(getClass().getResource("/org/unstable/unicorns/fxml/StartScreenFXML.fxml"));
        Scene startScene = new Scene(startScreen);
        startStage.setScene(startScene);
        //startStage.setResizable(false);
        startStage.setTitle("Unstable Unicorns");
        startStage.initOwner(stage);
        startStage.initModality(Modality.WINDOW_MODAL);

        startStage.addEventHandler(ButtonEvent.GAME_STARTED, (ButtonEvent event) ->
        {
            stage.show();
        });

        startStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
