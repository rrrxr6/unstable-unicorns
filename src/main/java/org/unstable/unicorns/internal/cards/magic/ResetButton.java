package org.unstable.unicorns.internal.cards.magic;

import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class ResetButton extends Magic {

    public ResetButton() {
        super("Reset Button"
                , "Each player must SACRIFICE all of their Upgrade and Downgrade cards. Shuffle the discard pile back into the deck."
                , Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/resetbutton.jpg"));
    }

}
