package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		// lecture
		Path pathFile = Paths.get("E:/Java diginamic/20220616/recensement_origin.csv");

		if (!Files.exists(pathFile)) {
			System.err.println("le fichier n'existe pas");
			return;
		}
		List<String> content = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

		List<String> selectedLines = new ArrayList<>();
		for (int i = 0; i < 5; /** Math.min(100, content.size()); */
				i++) {
			String string = content.get(i);
			selectedLines.add(string);
			System.out.println(string);

		}

		// ecriture
		Path targetPath = Paths.get("E:/Java diginamic/20220616/recensement_new.csv");

		List<String> selectedContent = new ArrayList<>();
		for (int i = 0; i < 100; /** Math.min(100, content.size()); */
				i++) {
			String string = content.get(i);
			selectedContent.add(string);

		}

		Files.write(targetPath, selectedContent, StandardOpenOption.CREATE);

	}

}
