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

    
    public void anzahlFaecherAusgeben()
    {
        System.out.println("##################");
        System.out.println("# Packstation");
        System.out.println("# Fächer Größe S: " + s.length);
        System.out.println("# Fächer Größe M: " + m.length);
        System.out.println("# Fächer Größe L: " + l.length);
        System.out.println("##################");
    }

    
    public void freieFaecherAusgeben(char pGroesse)
    {
        int freie = 0;

        if(pGroesse == 'S')
        {
            freie = freieFaecherZaehlen(s);
        }
        else if(pGroesse == 'M')
        {
            freie = freieFaecherZaehlen(m);
        }
        else if(pGroesse == 'L')
        {
            freie = freieFaecherZaehlen(l);
        }

        System.out.println("##################");
        System.out.println("# Packstation");
        System.out.println("# Anzahl freie Fächer der Größe " + pGroesse + ":");
        System.out.println("# " + freie + " freie Fächer.");
        System.out.println("##################");
    }

    
    private int freieFaecherZaehlen(Paket[] array)
    {
        int var = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == null)
            {
                var++;
            }
        }

        return var;
    }
    
    public boolean paketEntnehmen(String id)
    {
        if(entfernePaket(s,id))
            return true;
        if(entfernePaket(m,id))
            return true;
        if(entfernePaket(l,id))
            return true;

        System.out.println("Paket nicht gefunden.");
        return false;
    }
    
    public boolean paketEinlagern(Paket pPaket)
    {
        char g = pPaket.getGroesse();

        if (g == 'S')
            return einlagernArray(s, pPaket) || einlagernArray(m, pPaket) || einlagernArray(l, pPaket);

        if (g == 'M')
            return einlagernArray(m, pPaket) || einlagernArray(l, pPaket);

        if (g == 'L')
            return einlagernArray(l, pPaket);

        System.out.println("Kein passendes Fach frei");
        return false;
    }
    private boolean einlagernArray(Paket[] array, Paket p)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == null)
            {
                array[i] = p;
                System.out.println("Paket #" + p.getId() + " eingelagert.");
                return true;
            }
        }
        return false;
    }

   private boolean entfernePaket(Paket[] array, String id)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null && array[i].getId().equals(id))
            {
                System.out.println("Paket #" + id + " wurde entfernt.");
                array[i] = null;
                return true;
            }
        }
        return false;
    }
    

    
    public boolean paketVorhanden(String id)
    {
        return sucheArray(s,id) || sucheArray(m,id) || sucheArray(l,id);
    }


    private boolean sucheArray(Paket[] array, String id)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null && array[i].getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }
}