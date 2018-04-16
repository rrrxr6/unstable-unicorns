package org.unstable.unicorns.internal.cards.magic;

import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class Shakeup extends Magic {

    public Shakeup() {
        super("Shakeup"
                , "Shuffle this card, your hand, and the discard pile back into the deck, then DRAW five cards."
                , Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/shakeup.jpg"));
    }

}
