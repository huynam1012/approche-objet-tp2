package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFicher {

	public static void main(String[] args) throws IOException {

		int populationMin = 25_000;

		List<String> villes = new ArrayList<>();

		Path path = Paths.get("E:/Java diginamic/20220616/recensement_origin.csv");

		if (Files.exists(path)) {
			List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
			content.remove(0);

			for (int i = 1; i < content.size(); i++) {

				String line = content.get(i);

				String[] tokens = line.split(";");
				String popStr = tokens[9].replace(" ", "");
				int population = Integer.parseInt(popStr);

				if (population >= populationMin) {

					System.out.println("-------------------------");
					System.out.println("Commune : " + tokens[6] + " Numero de Departement : " + tokens[2] + " Region : "
							+ tokens[1] + " population : " + population);

					String lineOut = tokens[6] + ";" + tokens[2] + ";" + tokens[1] + ";" + population + ";";

					System.out.println("-------------------------");
					System.out.println(lineOut.toString());

					villes.add(lineOut);
				}
			}
		} else {
			System.err.println("le fichier n'existe pas");
			return;
		}

		villes.add(0, "Commune;Numero de Departement;Region;Population totale;");

		Files.write(Paths.get("E:/Java diginamic/20220616/grandesVilles.csv"), villes, StandardOpenOption.CREATE);

	}
}
