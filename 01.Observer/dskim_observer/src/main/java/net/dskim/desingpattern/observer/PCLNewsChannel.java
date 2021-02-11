package net.dskim.desingpattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    private String theMostRescentNews;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return theMostRescentNews;
    }

    public void setNews(String news) {
        this.theMostRescentNews = news;
    }
}
