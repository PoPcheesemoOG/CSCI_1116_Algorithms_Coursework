/* Name: Paul Helske
 * Date: 07/20/23
 */
package f;

public class WordOccurrence implements Comparable<WordOccurrence> {
	private String word;
	private int count;
	
	@Override
	public int compareTo(WordOccurrence e) {

		return this.getCount().compareTo(e.getCount());
	}
	
	public String toString() {
		return "" + word + "\t" + count;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}