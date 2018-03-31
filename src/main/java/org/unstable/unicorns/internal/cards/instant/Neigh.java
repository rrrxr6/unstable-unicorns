package org.unstable.unicorns.internal.cards.instant;

import java.awt.Image;
import java.awt.Toolkit;
import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 *
 * @author Matthew Hess
 */
public class Neigh extends Instant
{
    public Neigh()
    {
        super(PropertyAssistant.getString("org.unstable.unicorns.internal.cards.instant.Neigh.name"),
                PropertyAssistant.getString("org.unstable.unicorns.internal.cards.instant.Neigh.description"),
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/neigh.jpg"));
    }
}
