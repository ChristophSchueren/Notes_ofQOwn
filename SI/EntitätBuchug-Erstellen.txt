
================= Buchung =================
Fields
erstellungsDatum (Instant) required
ausfuehrungsDatum (Instant)
buchungsart (Buchungsart) required
genehmigungGeprueftAm (Instant)


FEHLEND:
genehmigt Bool 
befristungBis: Instant
befristungFuerProjekt: String



erstellungsDatum.toString = "111111-11-11T11:11"

mvn clean install -Dmaven.test.skip=true spring-boot:run