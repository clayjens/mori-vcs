package house.yourmommas.vcs;

import house.yourmommas.memento.Memento;

import java.util.HashMap;
import java.util.Map;

public record FileSnapshot(String message, Map<String, String> filesContent) implements Memento {
    public FileSnapshot(String message, Map<String, String> filesContent) {
        this.message = message;
        this.filesContent = new HashMap<>(filesContent);
    }

    @Override
    public Map<String, String> filesContent() {
        return new HashMap<>(filesContent);
    }
}
