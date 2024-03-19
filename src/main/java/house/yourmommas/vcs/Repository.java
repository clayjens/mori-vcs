package house.yourmommas.vcs;

import house.yourmommas.memento.Memento;
import house.yourmommas.memento.Originator;

import java.util.HashMap;
import java.util.Map;

public class Repository implements Originator {
    private Map<String, String> files = new HashMap<>();

    public void addFile(String fileName, String fileContent) {
        files.put(fileName, fileContent);
    }

    public Map<String, String> getFiles() {
        return files;
    }

    @Override
    public FileSnapshot saveStateToMemento(String message) {
        return new FileSnapshot(message, files);
    }

    @Override
    public void getStateFromMemento(Memento memento) {
        files = ((FileSnapshot) memento).filesContent();
    }
}
