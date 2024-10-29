package com.bptn.utils.copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils{

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        
        String DIRECTORY_PATH = System.getProperty("user.dir") + "/";
        
        String filePath = DIRECTORY_PATH + "test.txt";
        
        System.out.println(filePath);
        
        fileUtils.writeFile(Paths.get(filePath));
        fileUtils.updateFile(Paths.get(filePath));
        fileUtils.readFile(Paths.get(filePath));
        fileUtils.deleteFile(Paths.get(filePath));
    }

    // the isFileExist() method should be here
      public boolean isFileExist(Path path) {
        if (Files.exists(path)) {
            System.out.println("File exists!");
            return true;
        } else {
            System.out.println("File doesn't exist!");
            return false;
        }
    }


    // the isFileExistsWithExceptionHandling() should be here
    public boolean isFileExistsWithExceptionHandling(Path path) {
        try {
            File file = new File(path.toUri());
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            System.out.println("File exists!");
            scanner.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
            return false;
        }
    }

    // the createFileIfNotExist() method should be here
    public boolean createFileIfNotExist(Path path) {
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("File created: " + path.getFileName());
                return true;
            } else {
                System.out.println("File already exists: " + path.getFileName());
                return true;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            return false;
        }
    }

    // define readFile()  
    public void readFile(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            System.out.println("Reading file content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // define deleteFile() 

     public void deleteFile(Path path) {
        try {
            Files.deleteIfExists(path);
            System.out.println("File deleted: " + path.getFileName());
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }

    // define writeFile()

public void writeFile(Path path) {
        try (FileWriter writer = new FileWriter(path.toString())) {
            writer.write("This is the initial content of the file.\n");
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    // define updateFile()
public void updateFile(Path path) {
        try (FileWriter writer = new FileWriter(path.toString(), true)) {
            writer.write("This is the updated content of the file.\n");
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }
}