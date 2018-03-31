package org.unstable.unicorns.internal.cards.instant;

import java.awt.Image;
import org.unstable.unicorns.internal.cards.Card;

/**
 * The base instant class.
 *
 * @author Matthew Hess
 */
public abstract class Instant extends Card
{
    public Instant(String name, String description, Image image)
    {
        super(name, description, Type.INSTANT, image);
    }
}
