package org.unstable.unicorns.internal.cards.unicorn;

import java.awt.Toolkit;

import org.unstable.unicorns.internal.utilities.PropertyAssistant;

/**
 * The Alluring Narwhal Card class.
 * @author Matthew Hess
 */
public abstract class AlluringNarwhal extends Unicorn
{
  AlluringNarwhal()
  {
    super(PropertyAssistant.getString(""), PropertyAssistant.getString(""), Toolkit.getDefaultToolkit()
      .getImage("src/main/resources/org/unstable/unicorns/images/alluringNarwhal.jpg"), false);
  }

  @Override
  public void onStableEnter()
  {
    
  }
}
