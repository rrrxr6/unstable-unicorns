package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Toolkit;

import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 * The Alluring Narwhal Card class.
 *
 * @author Matthew Hess
 */
public class AlluringNarwhal extends Unicorn
{
    public AlluringNarwhal()
    {
        super(PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.AlluringNarwhal.name"),
                PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.AlluringNarwhal.description"),
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/alluringnarwhal.jpg"), false);
    }

    @Override
    public void onStableEnter()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onStableExit()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onSacrifice()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onDestroy()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onTurnBegin()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performStaticEffect()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
