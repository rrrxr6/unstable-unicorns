package org.unstable.unicorns.internal.cards.upgrade;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Description.
 * @author Your Name
 */
public class SummoningRitual extends Upgrade {

    public SummoningRitual() {
        super("Summoning Ritual", 
                "If this card is in your Stable at the beginning of your turn, you may DISCARD two Unicorns, then bring a Unicorn directly into your Stable from the discard pile.",
                Toolkit.getDefaultToolkit().getImage("src/main/resources/org/unstable/unicorns/images/summoningritual.jpg"));
    }
}
