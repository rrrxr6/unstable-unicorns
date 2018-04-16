package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class TinyStable extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public TinyStable() {
        super("Tiny Stable", "As long as this card is in your Stable, you can only have five Unicorns in your Stable.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/tinystable.jpg"));
        // TODO Auto-generated constructor stub
    }

}
