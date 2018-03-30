package org.unstable.unicorns.internal.events;

import javafx.event.Event;
import javafx.event.EventType;

/**
 * The button event class. This class should handle all {@link EventType EventTypes} for custom buttons.
 *
 * @author Matthew Hess
 */
public class ButtonEvent extends Event
{
    /**
     * Common supertype for all button event types.
     */
    public static final EventType<ButtonEvent> ANY
            = new EventType<ButtonEvent>(Event.ANY, "BUTTON");

    /**
     * This event occurs when a button is pushed triggering the game start.
     */
    public static final EventType<ButtonEvent> GAME_STARTED
            = new EventType<ButtonEvent>(ButtonEvent.ANY, "GAME_STARTED");

    public ButtonEvent(EventType<? extends Event> eventType)
    {
        super(eventType);
    }
}