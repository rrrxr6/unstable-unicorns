package org.unstable.unicorns.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Node;
import javafx.scene.control.Button;
import org.unstable.unicorns.internal.events.ButtonEvent;

/**
 *
 * @author Matthew Hess
 */
public class StartScreenFXMLDocumentController implements Initializable
{
    Button startButton;

    @FXML
    private void handleStartButtonAction(ActionEvent event)
    {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.fireEvent(new ButtonEvent(ButtonEvent.GAME_STARTED));
        stage.close();
    }

    @FXML
    private void handleRulesButtonAction(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("RulesFXML.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Unstable Unicorns - Rules");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
}
