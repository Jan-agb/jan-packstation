# Softwareprojekt Packstation
In diesem Softwareprojekt soll das Verwalten von Paketen in einer Packstation
simuliert werden. Auf dem Bild sind zwei Packstationen der Firma DHL exemplarisch
abgebildet.
<img width="688" height="313" alt="Bildschirmfoto 2026-03-05 um 09 06 30" src="https://github.com/user-attachments/assets/306b1e05-7578-4eab-82cc-fdcdcaeee972" />

## Anforderungen:
Die Packstation hat Fächer in drei verschiedenen Größen (S, M und L). Insgesamt
können 17 Pakete der Größe S, 22 Pakete der Größe M und 11 Pakete der Größe L in
der Packstation verstaut werden.
Jedes Paket hat eine feste Größe (S, M oder L), ein eindeutige Sendungs-ID und ein
Gewicht (in der Einheit kg).
An der Packstation sollen die folgenden Vorgänge durchgeführt werden können:
- Die Anzahl der Fächer mit ihrer Größe soll übersichtlich ausgegeben werden
können.
* Die Anzahl der freien Fächer soll für jede Größe ausgegeben werden können.
* Ein Paket soll in ein freies Fach mit passender Größe einsortiert werden
können. Sollte kein passendes Fach frei sein, so kann das Paket auch in freies
größeres Fach einsortiert werden.
* Es soll geprüft werden, ob ein Paket mit einer bestimmten Sendungs-ID
aktuell in der Packstation eingelagert ist.
* Ein Paket mit einer bestimmten Sendungs-ID soll aus einem Fach entnommen
werden können. Die Entnahme kann durch eine Text-Ausgabe simuliert
werden. Das entsprechende Fach ist anschließend wieder leer.

## Aufgabenstellung
* Modelliere ein geeignetes Softwareprojekt für den beschriebenen
Anwendungsfall, indem Du ein Implementationsdiagramm (drwaIO)
zeichnest.
* Implementiere das Softwareprojekt, indem Du das vorgegebene BlueJ-Projekt
erweiterst. Ergänze die bestehenden Klassen um die benötigten Attribute und
Methoden, damit alle Anforderungen umgesetzt werden.
Achte auf eine vollständige Dokumentation aller Methoden. Erweitere dein Projekt gerne durch weitere sinnvolle Features.
