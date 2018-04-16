package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class Yay extends Upgrade {

    public Yay() {
        super("Yay", 
                "As long as this card is in your Stable, cards you play cannot be Neigh'd.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/yay.jpg"));
    }
}
