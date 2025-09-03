public class _5_interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();

        Bear b = new Bear();
        b.grass();
        b.meat();
    }
}

// total abstract eg
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

// multiple inheritance eg
interface Herbivore {
    void grass();
}

interface Carnivore {
    void meat();
}

class Bear implements Herbivore, Carnivore {
    public void grass() {
        System.out.println("Eating grass");
    }

    public void meat() {
        System.out.println("Eating meat");
    }
}
