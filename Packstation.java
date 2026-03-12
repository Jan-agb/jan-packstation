
public class Packstation
{
    private Paket[] s;
    private Paket[] m;
    private Paket[] l;

    public Packstation(int pS, int pM, int pL)
    {
       s = new Paket[pS];
       m = new Paket[pM];
       l = new Paket[pL];
    }
    public void anzahlFaecherAusgeben(){
        System.out.println();
    }

    
    /**
     * Ein Beispiel einer Ausgabe-Methode
     * 
     * @param  ?   
     * @return  ?
     */
    public void freieFaecherAusgeben(char pGr)
    {
         // Einen Ausdruck simulieren. Dies ist als ein Vorschlag zu verstehen 
         // und soll erweitert werden.
        System.out.println("##################");
        System.out.println("# Packstation");
        System.out.println("# Anzahl freie Fächer der Größe S:");
        System.out.println("# " + var + " freie Fächer.");
        System.out.println("##################");
        System.out.println();
    }
}
