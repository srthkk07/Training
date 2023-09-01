import java.util.List;
import java.util.stream.Stream;

public interface AlbumDao {
	
		
		 void persist(Album a) ;
		
		 Album findByTitle(String title) throws InvalidAlbumException;
		
		 Album findByArtist(String artist);
		 
		 Album  findByGenre(String genre);
		
		 List<Album> albumlist();
		
		 boolean update(Album a) throws InvalidAlbumException;
		
		 boolean delete (String title) throws InvalidAlbumException;
		
		
}
