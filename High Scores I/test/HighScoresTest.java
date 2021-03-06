import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighScoresTest {

	private int[] scores;

	@Test
	public void insertionSortSortsSmallArray() {
		scores = new int[] {6, 3, 4, 1, 5, 2};
		HighScores.insertionSort(scores);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, scores);
	}

	@Test
	public void insertionSortSortsLargeArray() {
		scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = StdRandom.uniform(Integer.MAX_VALUE);
		}
		HighScores.insertionSort(scores);
		for (int i = 1; i < scores.length; i++) {
			assertTrue(scores[i - 1] <= scores[i]);
		}
	}

	@Test
	public void mergeSortSortsSmallArray() {
		scores = new int[] {6, 3, 4, 1, 5, 2};
		HighScores.mergeSort(scores);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, scores);
	}
	
	@Test
	public void mergeSortSortsLargeArray() {
		scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = StdRandom.uniform(Integer.MAX_VALUE);
		}
		HighScores.mergeSort(scores);
		for (int i = 1; i < scores.length; i++) {
			assertTrue(scores[i - 1] <= scores[i]);
		}
	}

}
