package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class Slowdown extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public Slowdown() {
        super("Slowdown", "As long as this card is in your Stable, you cannot play Instant cards.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/slowdown.jpg"));
        // TODO Auto-generated constructor stub
    }

}
