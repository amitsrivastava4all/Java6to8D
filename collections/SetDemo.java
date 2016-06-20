import java.util.HashSet;

class Album //implements Comparable<Album>
{
	private String songName;
	private String albumName;
	private String artistName;
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	// Search the right value
	@Override
	public boolean equals(Object o){
		Album a = (Album)o;
		if(this.albumName.equals(a.albumName) && this.artistName.equals(a.artistName) 
				&& this.songName.equals(a.songName)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Create the Bucket (HashCode) (Search the Right Bucket)
	@Override
	public int hashCode(){
		if(artistName.contains("Mr")){
			return 1000;
		}
		else
		if(artistName.contains("son")){	
			return 2000;
		}
		else
		{
			return 3000;
		}
		//return artistName.length();
	}
	
	/*@Override
	public int compareTo(Album o) {
		// TODO Auto-generated method stub
		return this.songName.compareToIgnoreCase(o.songName);
	}*/
	@Override
	public String toString(){
		return "Name "+this.songName+" Artist Name "+this.artistName+" AlbumName "+this.albumName+"\n";
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		HashSet<Album> songs = new HashSet<>();
		//TreeSet<Album> songs = new TreeSet<>();
		Album album = new Album();
		album.setAlbumName("Bang Bang");
		album.setSongName("Bang Bang");
		album.setArtistName("Mr X");
		songs.add(album);
		
		Album album2 = new Album();
		album2.setAlbumName("Bang Bang");
		album2.setSongName("Bang Bang");
		album2.setArtistName("Mr Y");
		songs.add(album2);
		
		Album album3 = new Album();
		album3.setAlbumName("It's My Life");
		album3.setSongName("It's My Life");
		album3.setArtistName("Jackson");
		songs.add(album3);
		
		System.out.println(songs);
		
		/*TreeSet<String> songs = new TreeSet<>();
		songs.add("Bang Bang");
		songs.add("Bang Bang");
		songs.add("Boom Boom");
		songs.add("Boom Boom");
		songs.add("It's My Life");
		System.out.println(songs);*/

	}

}
