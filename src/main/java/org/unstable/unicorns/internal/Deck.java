package org.unstable.unicorns.internal;

import org.unstable.unicorns.internal.cards.instant.Neigh;
import org.unstable.unicorns.internal.cards.unicorn.*;

/**
 *
 * @author Matthew Hess
 */
public class Deck extends CardSet
{
    public Deck()
    {
        super(CardSetType.DECK);
    }

    @Override
    public void initCardSet()
    {
        //Create Downgrades
        //Create Instants
        for (int i = 0; i < 20; i++)
        {
            this.addCard(new Neigh());
        }
        /*this.addCard(new SuperNeigh());*/

        //Create Magic
        //Create Unicorns
        this.addCard(new AlluringNarwhal());
        this.addCard(new AnnoyingFlyingUnicorn());

        //Create Upgrades
        this.shuffle();
    }
}
