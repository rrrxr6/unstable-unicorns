package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class SadisticRitual extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public SadisticRitual() {
        super("Sadistic Ritual", "If this card is in your Stable at the beginning of your turn, SACRIFICE a Unicorn, then DRAW and extra card.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/sadisticritual.jpg"));
        // TODO Auto-generated constructor stub
    }

}
