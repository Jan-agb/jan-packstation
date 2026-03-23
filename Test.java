public class Test
{
    Packstation ps1 = new Packstation(12, 23, 7);

    Paket p1 = new Paket(15, "PAKET1", 'M');
    Paket p2 = new Paket(5, "PAKET2", 'S');
    Paket p3 = new Paket(25, "PAKET3", 'L');

    public void test()
    {
        ps1.anzahlFaecherAusgeben();
        ps1.freieFaecherAusgeben('S');
        ps1.freieFaecherAusgeben('M');
        ps1.freieFaecherAusgeben('L');
        ps1.paketEinlagern(p1);
        ps1.paketEinlagern(p2);
        ps1.paketEinlagern(p3);
        ps1.freieFaecherAusgeben('S');
        ps1.freieFaecherAusgeben('M');
        ps1.freieFaecherAusgeben('L');
        System.out.println(ps1.paketVorhanden("PAKET1"));
        System.out.println(ps1.paketVorhanden("PAKET2"));
        System.out.println(ps1.paketVorhanden("PAKET3"));
        ps1.paketEntnehmen("PAKET2");
        System.out.println(ps1.paketVorhanden("PAKET2"));
        ps1.freieFaecherAusgeben('S');
    }
}