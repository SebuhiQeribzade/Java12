package Lesson12Mentor;
class Playlist {
    private Song[] songs;
    private int capacity;
    private int size;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.songs = new Song[capacity];
        this.size = 0;
    }

    // Add song to the playlist
    public void addSong(Song song) {
        if (size < capacity) {
            songs[size] = song;
            size++;
        } else {
            System.out.println("Playlist is full. Cannot add more songs.");
        }
    }

    // Display songs in the playlist
    public void displaySongs() {
        System.out.println("Songs in the Playlist:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + songs[i].getTitle() + " - " + songs[i].getArtist());
        }
    }
}

