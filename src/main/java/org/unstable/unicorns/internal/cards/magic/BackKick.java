package org.unstable.unicorns.internal.cards.magic;

import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class BackKick extends Magic {

    public BackKick() {
        super("Back Kick"
                , "Return a card in any player's Stable to that player's hand. That player must then Discard a card."
                , Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/backkick.jpg"));
    }

}
