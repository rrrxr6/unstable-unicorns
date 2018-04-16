package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class RainbowMane extends Upgrade {

    public RainbowMane() {
        super("Rainbow Mane", 
                "You must have a Basic Unicorn in your Stable in order to play this card. If this card is in your Stable at the beginning of your turn, you may bring a Basic Unicorn from your hand directly into your Stable.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/rainbowmane.jpg"));
    }
}
