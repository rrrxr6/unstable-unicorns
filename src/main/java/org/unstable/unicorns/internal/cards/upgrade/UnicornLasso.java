package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class UnicornLasso extends Upgrade {

    public UnicornLasso() {
        super("Unicorn Lasso", 
                "If this card is in your Stable at the beginning of your turn, you may move a Unicorn from any player's Stable to your Stable. At the end of your turn, move the Unicorn back to its original Stable.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/unicornlasso.jpg"));
    }
}
