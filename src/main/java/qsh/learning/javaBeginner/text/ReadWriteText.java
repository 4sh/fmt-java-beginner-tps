package qsh.learning.javaBeginner.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadWriteText {

    private static String generatedHistory = """
            La fontaîne de Java
                        
            Dans un monde lointain, il était une fois une île appelée Java. Java était une île magnifique, avec des plages de sable blanc, des forêts tropicales luxuriantes et des volcans enneigés.
                        
            Sur cette île vivait un peuple sage et intelligent, qui avait développé un langage de programmation appelé Java. Java était un langage puissant et polyvalent, capable de créer des applications pour une variété de plateformes.
                        
            Un jour, un jeune programmeur nommé Alice visita Java. Alice était une étudiante en informatique, et elle était passionnée par la programmation. Elle avait toujours rêvé de créer des applications qui aideraient les gens, et elle était déterminée à apprendre Java.
                        
            Alice commença à apprendre Java avec un cours en ligne. Elle était une élève rapide, et elle était bientôt en mesure de créer des applications simples. Elle était tellement enthousiaste à l'idée d'utiliser Java qu'elle commença à passer ses nuits et ses week-ends à travailler sur des projets.
                        
            Alice créa une application pour aider les étudiants à étudier. L'application fournissait des quiz, des exercices et des conseils d'étude. Elle créa également une application pour aider les entreprises à gérer leurs finances. L'application était facile à utiliser et permettait aux entreprises d'économiser du temps et de l'argent.
                        
            Les applications d'Alice étaient un succès. Elles furent utilisées par des milliers de personnes dans le monde entier. Alice était fière de son travail, et elle savait qu'elle avait utilisé Java pour faire une différence.
                        
            Un jour, Alice visita une fontaine dans la forêt tropicale. La fontaine était magnifique, avec de l'eau claire et cristalline qui s'élevait en un jet d'eau puissant.
                        
            Alice s'arrêta pour admirer la fontaine. Elle sentit une inspiration soudaine, et elle eut l'idée d'une nouvelle application.
                        
            Alice créa une application qui permettait aux gens de créer leurs propres fontaines virtuelles. L'application était facile à utiliser, et elle permettait aux gens de personnaliser leurs fontaines avec différentes couleurs, formes et motifs.
                        
            L'application d'Alice fut un succès. Elle fut utilisée par des millions de personnes dans le monde entier. Alice était heureuse d'avoir utilisé Java pour créer une application qui apportait de la joie aux gens.
                        
            Alice continua à travailler sur des projets Java. Elle créa des applications pour aider les gens à apprendre, à travailler et à se divertir. Elle était déterminée à utiliser Java pour faire une différence positive dans le monde.
            """;


    public static void main(String[] args) {
        var tp9 = Paths.get("target", "tp9");
        tp9.toFile().mkdir();

        Path javaHistory = tp9.resolve("java_history");

        try (var writer = new PrintWriter(Files.newBufferedWriter(javaHistory))) {
            Arrays.stream(generatedHistory.split("\n")).filter(s -> !s.isBlank()).forEach(writer::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader reader = new FileReader(javaHistory.toFile(), StandardCharsets.ISO_8859_1)) {
            char[] buffer = new char[5];
            reader.read(buffer, 0, 5);
            System.out.println(buffer);
            reader.read(buffer, 0, 5);
            System.out.println(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
