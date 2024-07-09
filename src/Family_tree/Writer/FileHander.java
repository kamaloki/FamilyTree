package Family_tree.Writer;

import java.io.*;

public class FileHander implements Writer{
    private String filePath = "src/Family_tree/Writer/tree.txt";


    @Override
    public void save(Serializable serializable){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public Object read() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(filePath))) {
            Object object = objectInputStream.readObject();
            return object;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setPath(String filePath) {
        this.filePath = filePath;
    }
}
