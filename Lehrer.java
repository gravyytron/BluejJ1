import java.util.*;
public class Lehrer
{
    public final String nachname;
    public int alter;
    public List<String> faecher = new ArrayList<String>();
    public final String geschlecht;

    public Lehrer()
    {
        this.nachname = "Müller";
        this.geschlecht = "male";
    }
    
    public Lehrer(String pNachname, int pAlter, String pGeschlecht)
    {
        this.nachname = pNachname;
        this.alter = pAlter;
        this.geschlecht = pGeschlecht;
    }
    
    public void addFach(String pFach) {
        this.faecher.add(pFach);
    }
    
    public void entferneFach(String pFach) {
        this.faecher.remove(this.faecher.indexOf(pFach));
    }
    
    public boolean hatFach(String pFach) {
        if(this.faecher.indexOf(pFach) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
