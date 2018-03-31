package org.unstable.unicorns.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.unstable.unicorns.internal.cards.Card;

/**
 * The base card set class. This class should handle all collections of cards. e.g. Hand, Deck, Discard Pile
 *
 * @author Matthew Hess
 */
public abstract class CardSet
{
    public enum CardSetType
    {
        DECK,
        DISCARD,
        HAND
    };

    private List<Card> cardSet = new ArrayList<>();
    private List<Card> removedCards = new ArrayList<>();
    private CardSetType cardSetType;

    public CardSet(CardSetType type)
    {
        this.cardSetType = type;
        initCardSet();
    }

    /**
     * Shuffles the set of cards
     */
    public void shuffle()
    {
        Collections.shuffle(this.cardSet);
    }

    /**
     * Returns the number of {@link Card Cards} left in the set
     *
     * @return the number of cards left in the set
     */
    public int cardsLeft()
    {
        return cardSet.size();
    }

    /**
     * Deals a single {@link Card} from the top of the set; the card will be removed from the set
     *
     * @return a the top card of the set
     */
    public Card draw()
    {
        if (cardSet.size() == removedCards.size())
        {
            throw new IllegalStateException("No cards are left in the set.");
        }

        Card card = cardSet.get(cardSet.size() - 1);

        cardSet.remove(card);
        removedCards.add(card);

        return card;
    }

    /**
     * Adds a single {@link Card} to the set
     *
     * @param card the {@link Card} to add to the set; cannot be null
     */
    public void addCard(Card card)
    {
        if (card != null)
        {
            cardSet.add(card);
            removedCards.remove(card);
        }
    }

    /**
     * Gets a specific {@link Card}; the card is removed from the current set
     *
     * @param neededCard the {@link Card} to get from the set; cannot be null
     * @return the specific card
     */
    public Card getCard(Card neededCard)
    {
        if (cardSet.isEmpty() || neededCard == null || !cardSet.contains(neededCard))
        {
            throw new IllegalStateException("Card not available in the set.");
        }

        cardSet.remove(neededCard);
        removedCards.add(neededCard);

        return neededCard;
    }

    public Card getCard(int index)
    {
        if (cardSet.isEmpty() || index < 0)
        {
            throw new IllegalStateException("No cards are left in the set.");
        }

        Card card = cardSet.get(index);

        cardSet.remove(card);
        removedCards.add(card);

        return card;
    }

    public List<Card> getAll()
    {
        return cardSet;
    }

    public Card getRandom()
    {
        if (cardsLeft() == 0)
        {
            throw new IllegalStateException("No cards are left in the set.");
        }
        Random randomizer = new Random();

        return this.getCard(randomizer.nextInt(cardsLeft()));
    }

    public abstract void initCardSet();
}
