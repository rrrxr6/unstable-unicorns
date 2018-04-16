package org.unstable.unicorns.internal.cards.downgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class Pandamonium extends Downgrade {

    /**
     * @param name
     * @param description
     * @param image
     */
    public Pandamonium() {
        super("Pandamonium", "As long as this card is in your Stable, all of your Unicorns are considered Pandas and NOT Unicorns. Cards that affect Unicorns do not affect Pandas.",  Toolkit.getDefaultToolkit()
                .getImage("src/main/resources/org/unstable/unicorns/images/pandamonium.jpg"));
        // TODO Auto-generated constructor stub
    }

}
