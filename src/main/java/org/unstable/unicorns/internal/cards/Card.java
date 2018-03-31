package org.unstable.unicorns.internal.cards;

import java.awt.Image;

/**
 * The base Card class. Every card in the deck should extend this class.
 * 
 * @author Matthew Hess
 */
public class Card
{
    public enum Type
    {
        DOWNGRADE,
        INSTANT,
        MAGIC,
        UNICORN,
        UPGRADE
    };
    
    private final String name;
    private final String description;
    private final Type type;
    private final Image image;
    
    public Card(String name, String description, Type type, Image image)
    {
        this.name = name;
        this.description = description;
        this.type = type;
        this.image = image;
    }

    /**
     * @return the card name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the card description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the card type
     */
    public Type getType()
    {
        return type;
    }

    /**
     * @return the card image
     */
    public Image getImage()
    {
        return image;
    }
}