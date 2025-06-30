package advancedMockitoexercise3;

interface FileReader {
    String read();
}

interface FileWriter {
    void write(String content);
}

class FileService {
    private FileReader fileReader;
    private FileWriter fileWriter;

    public FileService(FileReader fileReader, FileWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public String processFile() {
        String content = fileReader.read();
        fileWriter.write(content);
        return "Processed " + content;
    }
}
