
public class Sentence {

	private String currSent;

	/** Constructs a new Sentence object. */
	public Sentence(String p) {
		currSent = p;
	}

	/** Returns a string containing the current sentence. */
	public String toString() {
		return currSent;
	}
	


	/** Returns the index of the nth occurrence of str in the current sentence;
	 * returns -1 of the nth occurrence does not exist.
	 * Precondition:  str.length() > 0 and n > 0
	 * Postcondition: the current sentence if not modified.
	 */
	public int findNthTime(String str, int n) {
		/* part a */
		int index=-1;
		int pos=0;
		int time=0;
		while (time<n){
			index=currSent.indexOf(str,pos);
			if (index==-1){
				return -1;
			}
			else
				pos=index+str.length();
				time++;
		}
		return index;
	}
	

	/** Modifies the current sentence by replacing the nth occurrence of str with repl
	 * If the nth occurrence does not exist, the current sentence is unchanged.
	 * Precondition: str.length() > 0 and n > 0
	 *
	 */
	public void replaceNthTime(String str, int n, String repl) {
		int index = findNthTime(str,n);
		if (index!=-1){
			currSent=currSent.substring(0,index)+repl+currSent.substring(index+str.length());
		}
	}

	/** Returns the index of the last occurrence of str in the current sentence:
	 * returns -1 if str is not found.
	 * Precondition:  str.length() > 0
	 * Postcondition: the current sentence is not modified.
	 */
	public int findLastTime(String str) {
		/* part c - you must call findNthTime here */
		int realIndex=0;
		int n=0;
		int n2=1;
		if (currSent.indexOf(str)==-1)
			return -1;
		else{
			int testIndex=findNthTime(str,1);
			while (testIndex!=-1){
				n++;
				realIndex=findNthTime(str,n);
				n2++;
				testIndex=findNthTime(str,n2);
			}
		}
		return realIndex;
	}

	public static void main(String[] args) {
		Sentence sentence1 = new Sentence("A cat ate late.");
		System.out.println(sentence1.findNthTime("at",1));
		sentence1.replaceNthTime("at", 1, "rane");
		System.out.println(sentence1);
		
		Sentence sentence2 = new Sentence("A cat ate late.");
		System.out.println(sentence2.findNthTime("at",6));
		sentence2.replaceNthTime("at", 6, "xx");
		System.out.println(sentence2);
		
		Sentence sentence7 = new Sentence("A cat ate late.");
		System.out.println(sentence7.findNthTime("at",3));
		sentence7.replaceNthTime("at", 3, "xx");
		System.out.println(sentence7);
		
		Sentence sentence3 = new Sentence("A cat ate late.");
		System.out.println(sentence3.findNthTime("bat",2));
		sentence3.replaceNthTime("bat", 2, "xx");
		System.out.println(sentence3);
		
		Sentence sentence4 = new Sentence("aaaa");
		sentence4.replaceNthTime("aa", 1, "xx");
		System.out.println(sentence4);
		
		Sentence sentence5 = new Sentence("aaaa");
		sentence5.replaceNthTime("aaa", 2, "bbb");
		System.out.println(sentence5);
		
		Sentence sentence6 = new Sentence("A cat ate late.");
		System.out.println(sentence6.findLastTime("at"));
		System.out.println(sentence6.findLastTime("cat"));
		System.out.println(sentence6.findLastTime("bat"));
	}

}