package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class BardedWire extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public BardedWire() {
        super("Barbed Wire", "As long as this card is in your stable, you must discard a card each time a unicorn enters or leaves your stable.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/barbedwire.jpg"));
        // TODO Auto-generated constructor stub
    }

}
