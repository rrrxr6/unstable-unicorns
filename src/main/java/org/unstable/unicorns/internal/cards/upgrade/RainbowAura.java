package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class RainbowAura extends Upgrade {

    public RainbowAura() {
        super("Rainbow Aura", 
                "As long as this card is in your Stable, your Unicorns cannot be destroyed.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/rainbowaura.jpg"));
    }
}
