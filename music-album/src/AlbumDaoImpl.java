import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumDaoImpl implements AlbumDao {

	private List<Album> albums;

	public AlbumDaoImpl() throws Exception{
		try {
			Stream<String> lines = Files.lines(Paths.get("src/albums.txt"));
			albums = lines.map(line -> {
				String[] a_details = line.split(",");
				return new Album(a_details[0], a_details[1], a_details[2]);
			}).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void persist(Album a) {
		albums.add(a);

	}

	public Album findByTitle(String title)  {
		return albums.stream().filter(f -> f.getTitle().equals(title)).findFirst().orElse(null);
		
		}

	public Album findByGenre(String genre) {

		return albums.stream().filter(f -> f.getGenre()==genre).findFirst().get();
	}

	
	public List<Album> albumlist() {
		
		return albums;
	}

	@Override
	public boolean update (Album a) throws InvalidAlbumException {
		Optional<Album> albumToUpdate = albums.stream()
    .filter(album -> album.getTitle().equals(a.getTitle()))
    .findFirst();

	if (albumToUpdate.isPresent()) {
       Album updatedAlbum = albumToUpdate.get();
       updatedAlbum.setArtist(a.getArtist());
       updatedAlbum.setGenre(a.getGenre());
       return true;
      } else {
       throw new InvalidAlbumException("Album not found: " + a.getTitle());
      
    }
	}

	
	public boolean delete(String title)  {

		 return albums.removeIf(a -> a.getTitle() == title);
	}


	@Override
	public Album findByArtist(String artist) {
	
		return albums.stream().filter(f -> f.getArtist() == artist).findFirst().get();
	}

}
