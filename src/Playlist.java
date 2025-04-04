import java.util.ArrayList;

class Playlist {

    private String name;

    private ArrayList<String> tracks;

    public Playlist(String name) {

        this.name = name;

        this.tracks = new ArrayList<>();

    }

    public String getName() {

        return name;

    }

    public void addTrack(String track) {

        if (!tracks.contains(track)) {

            tracks.add(track);

            System.out.println("Added track: " + track);

        } else {

            System.out.println("Track already exists in the playlist.");

        }

    }

    public void removeTrack(String track) {

        if (tracks.remove(track)) {

            System.out.println("Removed track: " + track);

        } else {

            System.out.println("Track not found in the playlist.");

        }

    }

    public void displayTracks() {

        if (tracks.isEmpty()) {

            System.out.println("Playlist \"" + name + "\" is empty.");

        } else {

            System.out.println("Playlist \"" + name + "\" tracks:");

            for (String track : tracks) {

                System.out.println("- " + track);

            }

        }

    }

    public void clearPlaylist() {

        tracks.clear();

        System.out.println("Playlist \"" + name + "\" has been cleared.");

    }

} 