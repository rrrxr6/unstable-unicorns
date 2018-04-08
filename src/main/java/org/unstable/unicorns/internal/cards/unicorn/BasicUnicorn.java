package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Toolkit;
import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 *
 * @author Matthew Hess
 */
public class BasicUnicorn extends Unicorn
{
    public BasicUnicorn(int imageNumber)
    {
        super(PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.BasicUnicorn.name"),
                PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.BasicUnicorn.description"),
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/basicUnicorn" + imageNumber + ".jpg"), false);
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
