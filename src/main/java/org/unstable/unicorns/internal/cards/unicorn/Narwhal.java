package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Toolkit;
import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 *
 * @author Matthew Hess
 */
public class Narwhal extends Unicorn
{
    public Narwhal()
    {
        super("Narwhal",
                "This card has no special powers, but it sure is cute!",
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/narwhal.jpg"), false);
    }

    @Override
    public void onStableEnter()
    {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void onStableExit()
    {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void onSacrifice()
    {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void onDestroy()
    {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void onTurnBegin()
    {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void performStaticEffect()
    {
        throw new UnsupportedOperationException("Not supported.");
    }
}
