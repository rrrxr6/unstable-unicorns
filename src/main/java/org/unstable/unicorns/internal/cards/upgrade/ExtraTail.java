package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class ExtraTail extends Upgrade {

    public ExtraTail() {
        super("Extra Tail", 
                "You must have a Basic Unicorn in your Stable in order to play this card. If this card is in your Stable at the beginning of your turn, you may DRAW an extra card.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/extratail.jpg"));
    }
}
