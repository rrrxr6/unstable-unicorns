/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unstable.unicorns.internal.cards.instant;

import java.awt.Toolkit;
import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 *
 * @author Matthew Hess
 */
public class SuperNeigh extends Instant
{
    public SuperNeigh()
    {
        super(PropertyAssistant.getString("org.unstable.unicorns.internal.cards.instant.SuperNeigh.name"),
                PropertyAssistant.getString("org.unstable.unicorns.internal.cards.instant.SuperNeigh.description"),
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/superNeigh.jpg"));
    }
}
