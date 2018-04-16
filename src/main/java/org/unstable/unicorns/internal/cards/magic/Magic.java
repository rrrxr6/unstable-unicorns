package org.unstable.unicorns.internal.cards.magic;

import java.awt.Image;

import org.unstable.unicorns.internal.cards.Card;

/**
 * The base magic class.
 *
 * @author Matthew Hess
 */
public abstract class Magic extends Card
{
    public Magic(String name, String description, Image image) {
        super(name, description, Type.MAGIC, image);
    }

}
