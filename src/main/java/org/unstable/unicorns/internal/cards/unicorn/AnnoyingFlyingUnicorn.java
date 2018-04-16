package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Image;
import java.awt.Toolkit;
import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 * Description.
 *
 * @author Your Name
 */
public class AnnoyingFlyingUnicorn extends FlyingUnicorn
{
    public AnnoyingFlyingUnicorn()
    {
        super(PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.AnnoyingFlyingUnicorn.name"),
                PropertyAssistant.getString("org.unstable.unicorns.internal.cards.unicorn.AnnoyingFlyingUnicorn.description"),
                Toolkit.getDefaultToolkit()
                        .getImage("src/main/resources/org/unstable/unicorns/images/annoyingflyingunicorn.jpg"), true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onStableEnter()
    {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onStableExit()
    {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onTurnBegin()
    {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void performStaticEffect()
    {
        // TODO Auto-generated method stub

    }
}
