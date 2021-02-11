package net.dskim.desingpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannel implements PropertyChangeListener {

    private String theMostRecentNews;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return theMostRecentNews;
    }

    public void setNews(String news) {
        this.theMostRecentNews = news;
    }
}
