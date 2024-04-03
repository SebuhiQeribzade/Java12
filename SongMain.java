package Lesson12Mentor;
class Songmain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(5); // Create a playlist with a capacity of 5 songs

        // Adding songs to the playlist
        playlist.addSong(new Song("Shape of You", "Ed Sheeran", 240));
        playlist.addSong(new Song("Believer", "Imagine Dragons", 210));
        playlist.addSong(new Song("Havana", "Camila Cabello", 200));

        // Displaying songs in the playlist
        playlist.displaySongs();
    }}
