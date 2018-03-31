package org.unstable.unicorns.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.unstable.unicorns.internal.Deck;
import org.unstable.unicorns.internal.Hand;

/**
 * FXML Controller class
 *
 * @author Matthew Hess
 */
public class GameFXMLController implements Initializable
{
    @FXML
    private ListView deckList;

    @FXML
    private ListView playerOneHandList;

    @FXML
    private ListView randomCardsList;

    Deck deck;
    Hand hand;
    Hand randomHand;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        deck = new Deck();
        hand = new Hand();
        randomHand = new Hand();

        for (int i = 0; i < 7; i++)
        {
            hand.addCard(deck.draw());
        }

        deckList.setItems(FXCollections.observableArrayList(deck.getAll()));
        playerOneHandList.setItems(FXCollections.observableArrayList(hand.getAll()));
        randomCardsList.setItems(FXCollections.observableArrayList(randomHand.getAll()));
    }

    @FXML
    private void getRandom()
    {
        randomHand.addCard(hand.getRandom());

        deckList.setItems(FXCollections.observableArrayList(deck.getAll()));
        playerOneHandList.setItems(FXCollections.observableArrayList(hand.getAll()));
        randomCardsList.setItems(FXCollections.observableArrayList(randomHand.getAll()));
    }
}
