package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;

import org.unstable.unicorns.internal.cards.Card;

/**
 * The base upgrade class.
 *
 * @author Matthew Hess
 */
public abstract class Upgrade extends Card
{
    public Upgrade(String name, String description, Image image)
    {
        super(name, description, Type.UPGRADE, image);
    }
}
