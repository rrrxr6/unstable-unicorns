package org.unstable.unicorns.internal.cards.magic;

import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class MysticalVortex extends Magic {

    public MysticalVortex() {
        super("Mystical Vortex"
                , "Each player must DISCARD a card. Shuffle the discard pile back into the deck."
                , Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/mysticalvortex.jpg"));
    }

}
