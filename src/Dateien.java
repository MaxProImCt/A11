import java.util.Date;

public class Dateien implements FileComponent{

    private String  name;
    private int größe;

    public Dateien(String name, int größe){
        this.name = name;
        this.größe = größe;
    }

    @Override
    public void display(String shift) {
        shift+= shift;
        System.out.println(shift + "name: " + name + " größe: " + größe);
    }

    @Override
    public int getSize() {
        return größe;
    }
}
