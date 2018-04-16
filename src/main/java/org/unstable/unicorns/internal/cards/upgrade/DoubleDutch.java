package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class DoubleDutch extends Upgrade {

    public DoubleDutch() {
        super("Double Dutch", 
                "If this card is in your Stable at the beginning of your turn, you may play two cards during your turn instead of one.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/doubledutch.jpg"));
    }
}
