package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class BlindingLight extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public BlindingLight() {
        super("Blinding Light", "As long as this card is in your Stable, your unicorn card effects cannot be activated",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/blindinglight.jpg"));
        // TODO Auto-generated constructor stub
    }

}
