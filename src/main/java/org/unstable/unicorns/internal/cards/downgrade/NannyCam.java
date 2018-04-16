package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class NannyCam extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public NannyCam() {
        super("Nanny Cam", "As long as this card is in your Stable, you must play with your hand visible to all players.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/nannycam.jpg"));
        // TODO Auto-generated constructor stub
    }

}
