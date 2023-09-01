import java.util.Scanner;

public class AlbumMenu {
 private static AlbumDaoImpl dao;
 static {
		try {
			dao = new AlbumDaoImpl();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
 
 public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	while(true) {
		System.out.println("Main Menu");
		System.out.println("1-Add Album\n2-List of Album\n3-Find Album by title\n4-Find Album by artist\n5-Find Album by genre\n6-Update album\n7-Delete Album\n8-Exit");
		System.out.println("Enter your Choice: ");
		int ch = console.nextInt();
		switch (ch) {
		case 1: addAlbum();break;
		case 2: listofAlbum();break;
		case 3: findAlbumByTitle();break;
		case 4: findAlbumByArtist();break;
		case 5: findAlbumByGenre();break;
		case 6: updateAlbum();break;
		case 7: delAlbum();break;
		case 8: System.out.println("Good bye---visit again for exciting album collection!!");
		default: System.out.println("Invalid option");
		}
	}
}
private static void findAlbumByArtist() {
	Scanner console = new Scanner(System.in);

	System.out.println("Enter Artist Name : ");
	String artist = console.next();

	System.out.println(dao.findByArtist(artist));
	
}
private static void delAlbum() {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter Album title ");
	String name=console.next();
	dao.delete(name);
	
}
private static void updateAlbum() {
	 Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter album title to update : ");
	    String u_Title = scanner.nextLine(); // Declare and get the title to update

	    try {
	        Album foundAlbum = dao.findByTitle(u_Title); // Use dao to find the album by title

	        System.out.print("Enter new artist (or press Enter to keep current artist name): ");
	        String n_Artist = scanner.nextLine();

	        if (!n_Artist.isEmpty()) {
	            foundAlbum.setArtist(n_Artist);
	        }

	        System.out.print("Enter new genre (or press Enter to keep current genre name): ");
	        String n_Genre = scanner.nextLine();

	        if (!n_Genre.isEmpty()) {
	            foundAlbum.setGenre(n_Genre);
	        }

	        dao.update(foundAlbum);

	        System.out.println("Album updated successfully!!!");
	    } catch (InvalidAlbumException e) {
	        System.out.println(e.getMessage());
	    }
	
}
private static void findAlbumByGenre() {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter Album genre ");
	String g_name= console.next();
	System.out.println(dao.findByGenre(g_name));
	

	
}
private static void findAlbumByTitle() {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter Album title: ");
	String name= console.next();
	System.out.println(dao.findByArtist(name));

	
}

    private static void listofAlbum() {

	dao.albumlist().forEach(System.out::println);
	}

private static void addAlbum() {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter Album Title: ");
	String title= console.next();
	System.out.println("Enter album artist: ");
	String artist = console.next();
	System.out.println("Enter album genre ");
	String genre = console.next();
	Album a = new Album(title,artist,genre);
	dao.persist(a);
}
}
