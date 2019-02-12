package com.eipe;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot () {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class ToyStory extends Movie {
    public ToyStory() {
        super("Toy Story");
    }

    @Override
    public String plot() {
        return "A story about living toys";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Some young people trying to escape from a dangerous maze.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    //No plot method
}

public class Main {

    public static void main(String[] args) {
        Movie movie = randomMovie();
        System.out.println(movie.getName() + "'s Plot: " + movie.plot());
    }

    private static Movie randomMovie () {
        int rand = (int) (Math.random() * 3 + 1);
        //System.out.println("Random number is = " + rand);

        switch (rand) {
            case 1:
                return (new ToyStory());
            case 2:
                return (new MazeRunner());
            case 3:
                return (new Forgettable());
            default:
                return null;
        }
    }
}
