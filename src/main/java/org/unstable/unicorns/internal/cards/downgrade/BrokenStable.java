package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class BrokenStable extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public BrokenStable() {
        super("Broken Stable", "As long as this card is in your Stable, you cannot play Upgrade cards.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/brokenstable.jpg"));
        // TODO Auto-generated constructor stub
    }

}
