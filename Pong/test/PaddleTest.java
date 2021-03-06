import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaddleTest {

	public static final double DELTA = 0.001;
	
	private Paddle paddle;
	
	@BeforeEach
	public void setUp() {
		paddle = new Paddle(0.5);
	}

	@Test
	public void storesY() {
		assertEquals(0.5, paddle.getY(), DELTA);
	}

	@Test
	public void moves() {
		paddle.move(0.2);
		assertEquals(0.7, paddle.getY(), DELTA);
	}

	@Test
	public void doesNotMovePastFloor() {
		paddle = new Paddle(Paddle.HALF_HEIGHT + 0.1);
		paddle.move(-0.2);
		assertEquals(Paddle.HALF_HEIGHT, paddle.getY(), DELTA);
	}

	@Test
	public void doesNotMovePastCeiling() {
		paddle = new Paddle(1.0 - Paddle.HALF_HEIGHT - 0.1);
		paddle.move(0.2);
		assertEquals(1.0 - Paddle.HALF_HEIGHT, paddle.getY(), DELTA);
	}

}
