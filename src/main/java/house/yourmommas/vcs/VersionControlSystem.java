package house.yourmommas.vcs;

import house.yourmommas.memento.Caretaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class VersionControlSystem extends Caretaker {
    protected List<FileSnapshot> commits = new ArrayList<>();
    protected Repository repository = new Repository();

    public void commit(String message) {
        FileSnapshot memento = repository.saveStateToMemento(message);
        commits.add(memento);
    }

    public void stageFile(String fileName, String fileContents) {
        repository.addFile(fileName, fileContents);
    }

    public Map<String, String> getFiles() {
        return repository.getFiles();
    }

    public void checkout(int version) throws IndexOutOfBoundsException {
        repository.getStateFromMemento(commits.get(version));
    }

    public abstract void showCommitHistory();
}
