/**
 * Beschreiben Sie hier die Klasse Paket.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Paket
{
    private double gewicht;
    private String id;
    private char groesse;

    /**
     * Konstruktor für Objekte der Klasse Paket
     */
    public Paket(double pGewicht, String pID, char pGroesse)
    {
        gewicht = pGewicht;
        groesse = pGroesse;
        id = pID;
    }
    public char getGroesse()
    {
        return groesse;
    }
    public String getId()
    {
        return id;
    }
    public double getGewicht()
    {
        return gewicht;
    }
}
