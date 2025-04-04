public class Program {
    public static void main(String[] args) {

        MusicLibrary myLibrary = new MusicLibrary("Rock Collection", "John Smith");

        myLibrary.addTrack("Led Zeppelin - Stairway to Heaven");
        myLibrary.addTrack("Queen - Bohemian Rhapsody");
        myLibrary.addTrack("Pink Floyd - Comfortably Numb");
        myLibrary.addTrack("AC/DC - Back in Black");

        System.out.println("All tracks:");
        myLibrary.displayTracks();

        myLibrary.createPlaylist("Favorites");
        myLibrary.createPlaylist("Workout");

        myLibrary.addTrackToPlaylist("Favorites", "Bohemian Rhapsody");
        myLibrary.addTrackToPlaylist("Favorites", "Comfortably Numb");
        myLibrary.addTrackToPlaylist("Workout", "Back in Black");

        System.out.println("\nAll playlists:");
        myLibrary.displayAllPlaylists();

        System.out.println("\nSearching for 'Bohemian':");
        myLibrary.searchTracks("Bohemian");

        myLibrary.removeTrack("Bohemian Rhapsody");
        System.out.println("\nTracks after removal:");
        myLibrary.displayTracks();
    }
}
