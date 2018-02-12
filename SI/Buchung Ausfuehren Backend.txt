Backend Buchung save

IN spiritinventory\web\rest\BuchungResource.java

Buchung result = buchungService.save(buchung);


//

BuchungService.java

public Buchung setRequiredFields(Buchung buchung) {
        // added erstellungsDatum
        buchung.setErstellungsDatum(Instant.now());
        buchung.setGenehmigt(false);

        log.debug("Buchung setReqiredFields() {}", buchung);
        return buchung;
    }

    public Buchung ApplyBuchung(Buchung buchung) {
       // geraet holen
        Geraet geraet = buchung.getGeraet(); // geraetService.findOne(buchung.geraet);
        User neuerUser = buchung.getEmpfaenger();
        geraet.setUser(neuerUser);

        geraetService.save(geraet);

        buchung.setAusfuehrungsDatum(Instant.now());
        return buchungRepository.save(buchung);
        // Endlosschleife mit this.save(buchung) !!!
    }