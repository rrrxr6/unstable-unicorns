package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class GlitterBomb extends Upgrade {

    public GlitterBomb() {
        super("Glitter Bomb", 
                "If this card is in your Stable at the beginning of your turn, you may SACRIFICE a card, then DESTORY a card.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/glitterbomb.jpg"));
    }
}
