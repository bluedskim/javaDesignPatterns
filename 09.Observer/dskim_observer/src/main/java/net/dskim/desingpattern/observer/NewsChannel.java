package net.dskim.desingpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Listener(Subscriber)
 */
public class NewsChannel implements PropertyChangeListener {

	private String news;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		news = (String) evt.getNewValue();
	}

	public String getNews() {
		return news;
	}
}