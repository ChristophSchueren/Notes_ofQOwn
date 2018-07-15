BerechtigungsCheckService
=========================
nur noch in EntityRessources

NICHT mehr in Services.

### Mehthod Renamings
checkIfUserAllowedForGeraet(geraet)

to:
boolean isUserAllowedFor(Geraet geraet)


#### Überladung
boolean isUserAllowedFor(DateiAnhang anhang)

#### Generics
isUserAllowedFor<DateiAnhang>(String dateiAnhangId)
isUserAllowedFor<DateiAnhang>(DateiAnhang geraetId)