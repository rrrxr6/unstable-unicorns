package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Image;

/**
 * Description.
 *
 * @author Your Name
 */
public abstract class FlyingUnicorn extends Unicorn
{

    public FlyingUnicorn(String name, String description, Image image, Boolean hasStaticEffect)
    {
        super(name, description, image, hasStaticEffect);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onSacrifice()
    {
        // Player.addToHand(this)
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onDestroy()
    {
        // Player.addToHand(this)
    }
}
