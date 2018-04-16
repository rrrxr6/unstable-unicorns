package org.unstable.unicorns.internal;

import org.unstable.unicorns.internal.cards.downgrade.BardedWire;
import org.unstable.unicorns.internal.cards.downgrade.BlindingLight;
import org.unstable.unicorns.internal.cards.downgrade.BrokenStable;
import org.unstable.unicorns.internal.cards.downgrade.NannyCam;
import org.unstable.unicorns.internal.cards.downgrade.Pandamonium;
import org.unstable.unicorns.internal.cards.downgrade.SadisticRitual;
import org.unstable.unicorns.internal.cards.downgrade.Slowdown;
import org.unstable.unicorns.internal.cards.downgrade.TinyStable;
import org.unstable.unicorns.internal.cards.instant.Neigh;
import org.unstable.unicorns.internal.cards.instant.SuperNeigh;
import org.unstable.unicorns.internal.cards.magic.BackKick;
import org.unstable.unicorns.internal.cards.magic.BlatantThievery;
import org.unstable.unicorns.internal.cards.magic.ChangeOfLuck;
import org.unstable.unicorns.internal.cards.magic.GlitterTornado;
import org.unstable.unicorns.internal.cards.magic.GoodDeal;
import org.unstable.unicorns.internal.cards.magic.MysticalVortex;
import org.unstable.unicorns.internal.cards.magic.ResetButton;
import org.unstable.unicorns.internal.cards.magic.Retarget;
import org.unstable.unicorns.internal.cards.magic.Shakeup;
import org.unstable.unicorns.internal.cards.magic.TargetedDestruction;
import org.unstable.unicorns.internal.cards.magic.TwoForOne;
import org.unstable.unicorns.internal.cards.magic.UnfairBargain;
import org.unstable.unicorns.internal.cards.magic.UnicornPoison;
import org.unstable.unicorns.internal.cards.magic.UnicornShrinkray;
import org.unstable.unicorns.internal.cards.magic.UnicornSwap;
import org.unstable.unicorns.internal.cards.unicorn.AlluringNarwhal;
import org.unstable.unicorns.internal.cards.unicorn.AnnoyingFlyingUnicorn;
import org.unstable.unicorns.internal.cards.unicorn.BasicUnicorn;

/**
 * The {@link Card cards} representing a game-wide set available to all players. e.g., A deck, or discard pile
 *
 * @author Matthew Hess
 */
public class Deck extends CardSet
{
    public Deck(CardSetType type)
    {
        super(type);
    }

    @Override
    public void initCardSet()
    {
        if(this.getType() == CardSetType.DECK)
        {
            //Create Downgrades
            this.addCard(new BardedWire());
            this.addCard(new BlindingLight());
            this.addCard(new BrokenStable());
            this.addCard(new NannyCam());
            this.addCard(new Pandamonium());
            this.addCard(new SadisticRitual());
            this.addCard(new Slowdown());
            this.addCard(new TinyStable());

            //Create Instants
            for (int i = 0; i < 14; i++)
            {
                this.addCard(new Neigh());
            }
            this.addCard(new SuperNeigh());

            //Create Magic
            this.addCard(new UnicornShrinkray());
            this.addCard(new GoodDeal());
            this.addCard(new Shakeup());
            this.addCard(new MysticalVortex());
            this.addCard(new ResetButton());
            this.addCard(new BlatantThievery());
            this.addCard(new TargetedDestruction());
            for (int i = 0; i < 2; i++)
            {
                this.addCard(new GlitterTornado());
                this.addCard(new UnfairBargain());
                this.addCard(new UnicornSwap());
                this.addCard(new ChangeOfLuck());
                this.addCard(new TwoForOne());
                this.addCard(new Retarget());
            }
            for (int i = 0; i < 3; i++)
            {
                this.addCard(new UnicornPoison());
                this.addCard(new BackKick());
            }

            //Create Basic Unicorns
            for (int i = 1; i < 8; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    this.addCard(new BasicUnicorn(i));
                }
            }
            this.addCard(new BasicNarwhal());

            //Create Other Unicorns
            this.addCard(new AlluringNarwhal());
            this.addCard(new AnnoyingFlyingUnicorn());

            //Create Upgrades
            this.addCard(new RainbowAura());
            this.addCard(new UnicornLasso());
            this.addCard(new SummoningRitual());
            this.addCard(new DoubleDutch());
            for(int i = 0; i < 2; i++)
            {
                this.addCard(new GlitterBomb());
                this.addCard(new Yay());
            }
            for (int i = 0; i < 3; i++)
            {
                this.addCard(new RainbowMane());
                this.addCard(new ExtraTail());
            }

            this.shuffle();
        }
    }
}
