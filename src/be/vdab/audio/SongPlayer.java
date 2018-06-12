package be.vdab.audio;

public class SongPlayer {
    public static void main(String[] args) {
        Note[] song = {
                new Note(Note.C4, 2),
                new Note(Note.D4, 2),
                new Note(Note.E4, 2),
                new Note(Note.C4, 2),
                new Note(Note.C4, 2),
                new Note(Note.D4, 2),
                new Note(Note.E4, 2),
                new Note(Note.C4, 2),
                new Note(Note.E4, 2),
                new Note(Note.F4, 2),
                new Note(Note.G4, 2),
                new Note(Note.REST, 2),
                new Note(Note.E4, 2),
                new Note(Note.F4, 2),
                new Note(Note.G4, 2),
                new Note(Note.REST, 2),
                new Note(Note.G4, 1),
                new Note(Note.A4, 1),
                new Note(Note.G4, 1),
                new Note(Note.F4, 1),
                new Note(Note.E4, 2),
                new Note(Note.C4, 2),
                new Note(Note.G4, 1),
                new Note(Note.A4, 1),
                new Note(Note.G4, 1),
                new Note(Note.F4, 1),
                new Note(Note.E4, 2),
                new Note(Note.C4, 2),
                new Note(Note.C4, 2),
                new Note(Note.G3, 2),
                new Note(Note.C4, 2),
                new Note(Note.REST, 2),
                new Note(Note.C4, 2),
                new Note(Note.G3, 2),
                new Note(Note.C4, 2),
                new Note(Note.REST, 2)
        };

        Player p = new Player(16 * 1024);
        int r = 0;
        double tempo = 0.25;    // Seconds
        for (Note note : song) {
            p.play(note.getTone(), tempo * note.getLength());
        }
    }
}

