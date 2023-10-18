package ExceptionHandling_Extraparctice_2;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        if (index < 0 || index > magazines.size())
            return null;
        Magazine newMagazine = magazines.get(index);
        return newMagazine;
    }

    public void setMagazine(int index, Magazine magazine) {
        if (index < 0 || index > magazines.size()) {
            return;
        }
        Magazine newMagazine = (Magazine) magazine;
        magazines.set(index , newMagazine);
    }

    public void addMagazine(Magazine magazine) {
        Magazine newMagazine = (Magazine) magazine;
        magazines.add(newMagazine);

    }



    

    

    
}
