package subway;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import subway.SubwayStation.State;

public class SubwayStationTest {

	private SubwayStation subway;

	@Before
	public void setUp() throws Exception {
		subway = new SubwayStation();
	}

	@After
	public void tearDown() throws Exception {
		subway = null;
	}

	@Test
	public void testInsertCoin() {
		subway.insertCoin();
		assertEquals(subway.getCurrState(),State.UNLOCKED);
	}

	@Test
	public void testPass() {
		subway.insertCoin();
		subway.pass();
		assertEquals(subway.getCurrState(),State.LOCKED);
	}
}
