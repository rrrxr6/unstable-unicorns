package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import org.unstable.unicorns.internal.cards.Card;

/**
 * The base downgrade class.
 *
 * @author Matthew Hess
 */
public abstract class Downgrade extends Card
{
    public Downgrade(String name, String description, Image image)
    {
        super(name, description, Type.DOWNGRADE, image);
    }
}