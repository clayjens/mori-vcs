package house.yourmommas;

import house.yourmommas.vcs.FileSnapshot;
import house.yourmommas.vcs.VersionControlSystem;

import java.util.Map;

public class Mori extends VersionControlSystem {

    @Override
    public void showCommitHistory() {
        System.out.println("Mori Commit History:");
        for (int i = 0; i < commits.size(); i++) {
            FileSnapshot commit = commits.get(i);

            System.out.println("Commit #" + i + ": " + commit.message());
            for (Map.Entry<String, String> entry : commit.filesContent().entrySet()) {
                String fileName = entry.getKey();
                String fileContent = entry.getValue();

                System.out.println("\t- File `" + fileName + "` contains: `" + fileContent + "`");
            }
        }
    }
}