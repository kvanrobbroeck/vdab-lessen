package be.vdab.audio;

public class BluesGenerator {
    public static void main(String[] args) throws InterruptedException {
//        // Hexatonic
        Note[] scale = {
            new Note(Note.C4, 1),
            new Note(Note.Eb4, 1),
            new Note(Note.F4, 1),
            new Note(Note.Fs4, 1),
            new Note(Note.G4, 1),
            new Note(Note.Bb4, 1),
            new Note(Note.C5, 1),
        };

        // Blue notes only
//        Note[] scale = {
//                new Note(Note.Eb4, 1),
//                new Note(Note.Fs4, 1),
//                new Note(Note.Bb4, 1),
//        };

        int[] rythm = {1, 2, 1, 1, 0, 0, 1, 0, 0, 1, 0};

        Player p = new Player();
        int r = 0;
        double tempo = 0.2;
        while(true) {
            int i = (int) (Math.random() * scale.length);
            Note n = scale[i];
            if(rythm[r] == 0) {
                p.play(new CompositeWave(Note.REST), 1 * tempo);
            } else {
                p.play(n.getTone(), n.getLength() * rythm[r] * tempo);
            }

            if(++r == rythm.length) {
                r = 0;
            }
        }
    }
}

