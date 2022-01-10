import java.io.File;
import java.nio.file.Files;
import java.util.LinkedList;

public class Ordner implements FileComponent{

    public int size;
    public String name;
    private LinkedList<FileComponent> files;

    public Ordner(String name)
    {
        size = 0;
        this.name = name;
        this.files = new LinkedList<FileComponent>();
    }


    public void add(FileComponent fileComponent)
    {
        if(!(files.contains(fileComponent)))
        {
            files.add(fileComponent);
            size = size + fileComponent.getSize();
        }
    }

    public void display(String shift)
    {
        shift += shift;
        System.out.println(shift + "Ordnername: " + name + " " + getSize());
        for(FileComponent fc : files)
        {
            fc.display(shift);
        }
    }

    public int getSize()
    {
        int size = 0;
        for(FileComponent fileComponent : files)
        {
            size += fileComponent.getSize();
        }
        return size;
    }
}
