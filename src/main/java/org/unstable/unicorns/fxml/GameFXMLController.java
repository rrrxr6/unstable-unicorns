package org.unstable.unicorns.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.unstable.unicorns.internal.CardSet;
import org.unstable.unicorns.internal.CardSet.CardSetType;
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

    @FXML
    private ListView discardList;

    Deck deck;
    Deck discard;
    Hand hand;
    Hand randomHand;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        deck = new Deck(CardSetType.DECK);
        discard = new Deck(CardSetType.DISCARD);
        hand = new Hand();
        randomHand = new Hand();

        for (int i = 0; i < 7; i++)
        {
            hand.addCard(deck.draw());
        }

        updateLists();
    }

    @FXML
    private void getRandom()
    {
        randomHand.addCard(hand.getRandom());

        updateLists();
    }

    @FXML
    private void draw()
    {
        hand.addCard(deck.draw());

        updateLists();
    }

    private void updateLists()
    {
        deckList.setItems(FXCollections.observableArrayList(deck.getAll()));
        playerOneHandList.setItems(FXCollections.observableArrayList(hand.getAll()));
        randomCardsList.setItems(FXCollections.observableArrayList(randomHand.getAll()));
    }
}
