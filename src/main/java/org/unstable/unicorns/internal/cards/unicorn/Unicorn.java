package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Image;

import org.unstable.unicorns.internal.Player;
import org.unstable.unicorns.internal.cards.Card;

/**
 * The base unicorn class.
 *
 * @author Matthew Hess
 */
public abstract class Unicorn extends Card
{
    private final Boolean hasStaticEffect;

    private Player currentOwner;
    private Player originalOwner;

    private Boolean allEffectsCompleted;

    public Unicorn(String name, String description, Image image, Boolean hasStaticEffect)
    {
        super(name, description, Type.UNICORN, image);
        this.hasStaticEffect = hasStaticEffect;
    }

    /**
     * @return {@code true} if the unicorn has a static effect, {@code false} otherwise
     */
    public Boolean hasStaticEffect()
    {
        return hasStaticEffect;
    }

    /**
     * Sets the current unicorn owner
     *
     * @param currentOwner
     */
    public void setCurrentOwner(Player currentOwner)
    {
        this.currentOwner = currentOwner;
    }

    /**
     * @return the current unicorn owner
     */
    public Player getCurrentOwner()
    {
        return currentOwner;
    }

    /**
     * Sets the original unicorn owner
     *
     * @param originalOwner
     */
    public void setOriginalOwner(Player originalOwner)
    {
        this.originalOwner = originalOwner;
    }

    /**
     * @return the original unicorn owner
     */
    public Player getOriginalOwner()
    {
        return originalOwner;
    }

    /*
   *  The action to take when the {@link Player} plays this card.
     */
    public void play()
    {

    }

    /*
   *  The action to take when the {@link Player} discards this card.
     */
    public void discard()
    {

    }

    /*
   *  The action to take when this card enters a {@link Player}'s stable.
     */
    public abstract void onStableEnter();

    /*
   *  The action to take when this card exits a {@link Player}'s stable.
     */
    public abstract void onStableExit();

    /*
   *  The action to take when this card is sacrificed.
     */
    public abstract void onSacrifice();

    /*
   *  The action to take when this card is destroyd.
     */
    public abstract void onDestroy();

    /*
   *  The action to take if this card is in a {@link Player}'s stable at the beginning of the turn.
     */
    public abstract void onTurnBegin();

    /*
   *  The action to take when another action triggers a unicorn effect.
     */
    public abstract void performStaticEffect();
}
