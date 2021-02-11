package net.dskim.desingpattern.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverTest {

	@Test
	public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {
		String newsName = "뉴스 제목";

		NewsAgency observable = new NewsAgency();
		NewsChannel observer1 = new NewsChannel();
		NewsChannel observer2 = new NewsChannel();

		observable.addPropertyChangeListener(observer1);
		observable.addPropertyChangeListener(observer2);
		observable.setNews(newsName);

		log.info("observer.getNews()={}", observer1.getNews());
		assertEquals(observer1.getNews(), newsName);
		assertEquals(observer2.getNews(), newsName);
	}
}
