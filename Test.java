public class Test
{
    Packstation ps1 = new Packstation(12, 23, 7);
    Paket p1 = new Paket(15, "PAKET1", 'M');
    
    public void test()
    {
        ps1.anzahlFaecherAusgeben();
        ps1.freieFaecherAusgeben('M');
        ps1.paketEinlagern(p1);
        
    }
}