
public class BookShelf {

	public static void main(String[] args) {
		
		Book B1 = new Book("Java Software Solution", "John Lewis", "Addison Wesley", 1990);
		Book B2 = new Book("Digital Design", "M. Morris Mano, Michael D. Ciletti", "Prentice Hall", 2012);
		Book B3 = new Book("Fundamentals of Design", "Carlos Coronel, Stephen Morris, Peter Rob", "South Western", 2013);
		Book B4 = new Book("Zealot", "Jan Wan", "Random House", 2013);
		Book B5 = new Book("Diary of a Wimpy Kid", "Jeff Kinney", "J.W. Production", 2013);
		
		System.out.println();
		B3.setTitle("Fundamentals of Design, Implementation, and Management, 10th edition");
		B4.setAuthor("Reza Aslan");
		B5.setPublisher("Amulet Books");
		B1.setCopyright(2008);
		B1.setTitle("Java Software Solutions: Foundations of Program Design, 6/E or 7/E");
		
		System.out.println("@@@@@@@@@@@@@ Book Shelf @@@@@@@@@@@@@");
		System.out.println(B1);
		System.out.println("**************************************");
		System.out.println(B2);
		System.out.println("**************************************");
		System.out.println(B3);
		System.out.println("**************************************");
		System.out.println(B4);
		System.out.println("**************************************");
		System.out.println(B5);
		System.out.println("**************************************");
	}

}
