import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Reading Files
        File file = new file("C:\\Users\\user\\IdeaProjects\\ReadingFiles\\text.txt");
        try {
            while (scanner.hasNext())  {
            Scanner scanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }
}


    //каноничный пример
     try (Scanner scanner2 = new Scanner(file)) {
        while (scanner2.hasNext()); {
            System.out.println(scanner2.nextLine() + " ");
        }
    }  catch (FileNotFoundException e) {
     System.out.println("NO file found: " + file2);
    }

     // работаем с многостроковыми текстом
     String pathToFileInUsers ="C:\\Users\\user\\folderForFiles\\text.txt");
     // вызывая из метода
     System.out.println(readFileAsString(pathToFileInUsers));
     //вызывая непосредственно
     try {
     System.out.println(new String(Files.readAllBytes(Paths.get(pathToFileInUsers))));
     }catch (Exception e) {
         System.out.println(e.getCause());
    }

     // запись в файл
    String message ="Added text";
     Path path = Path.of(first:"C:\\Users\\user\\folderForFiles\\text.txt");
     Files.writeString(path, message);
