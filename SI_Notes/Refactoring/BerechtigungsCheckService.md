BerechtigungsCheckService
=========================
nur noch in EntityRessources

NICHT mehr in Services.

### Mehthod Renamings
checkIfUserAllowedForGeraet(geraet)

to:
booisUserAllowedFor(Geraet geraet)


#### Überladung
isUserAllowedFor(DateiAnhang anhang)

#### Generics
isUserAllowedFor<DateiAnhang>(String dateiAnhangId)
isUserAllowedFor<DateiAnhang>(DateiAnhang geraetId)