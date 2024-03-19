package house.yourmommas;

import house.yourmommas.vcs.VersionControlSystem;

public class Demo {
    public static void main(String[] args) {
        VersionControlSystem mori = new Mori();

        mori.stageFile("file.txt", "Hello World");
        mori.commit("Greet the world :)");

        mori.stageFile("file.txt", "Goodbye World");
        // I totally meant to commit my diary entries
        mori.stageFile("super-secret.txt", "Dear diary...");
        mori.commit("Leave the world :(");

        mori.showCommitHistory();
        System.out.println("----------------------------------\n");

        System.out.println("Checking out Commit #0...");
        mori.checkout(0);

        mori.showCommitHistory();
        System.out.println("----------------------------------\n");

        mori.stageFile("file2.txt", "The Memento pattern is really cool!");
        mori.commit("Adore the Memento pattern");

        mori.showCommitHistory();
    }
}
