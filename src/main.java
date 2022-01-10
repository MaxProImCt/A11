import java.io.File;
import java.util.Date;

public class main {

    public static void main(String[] args) {
        Ordner spotify = new Ordner("Spotify");
        Ordner rock = new Ordner("Rock");
        Ordner rap = new Ordner("Rap");
        Ordner pop = new Ordner("Pop");
        Ordner assiRap = new Ordner("Assi Rap");

        Dateien grabrede = new Dateien("Grabrede", 14);
        Dateien schnellMachen = new Dateien("Schnell machen" , 18);
        Dateien wennIchWill = new Dateien("Wenn ich will" , 10);
        Dateien work = new Dateien("Work" , 8);
        Dateien inTheEnd = new Dateien("In the end" , 7);
        Dateien breakingtheHabit = new Dateien("Breaking the Habit",6);
        Dateien badMan = new Dateien("Bad Man" , 71);
        Dateien badMan2 = new Dateien("Bad Man2" , 36);

        spotify.add(rock);
        spotify.add(pop);
        spotify.add(rap);

        rap.add(schnellMachen);
        rap.add(wennIchWill);

        rap.add(assiRap);

        assiRap.add(grabrede);
        rock.add(inTheEnd);
        rock.add(breakingtheHabit);
        pop.add(work);
        pop.add(badMan);
        pop.add(badMan2);

        spotify.display(" ");
        System.out.println("Größer aller Dateien: " + spotify.getSize());
    }



}