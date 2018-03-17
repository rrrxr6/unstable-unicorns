package org.unstable.unicorns.internal.utilities;

import java.util.ResourceBundle;
import java.util.Locale;

/**
 * The property assistant class. This class should handle all game internationalization.
 * @author Matthew Hess
 */
public abstract class PropertyAssistant
{
  private static final ResourceBundle resources = ResourceBundle
    .getBundle("resources", new Locale("en","US"));

  public static final String getString(String key)
  {
    return resources.getString(key);
  }
}
