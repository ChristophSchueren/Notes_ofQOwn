Testing Problem
===============

BuchungResourceIntTest

post /buchung
schlägt mit Fehler 500 fehl. Schlecht.
Fehler 400 waere in Ordnung da Geraet mit GeraetId nicht in Datenbank ist.

```
TestBuchungValidity() {
	buchung.geraet in Datenbank
}
```
### Mögliche Lösung
vergleiche ssv ActivityResoucreIntTest

```
import javax.persistence.EntityManager;

/**
     * Create an entity for this test.
     * <p>
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Activity createEntity(EntityManager em) {

        Activity activity = new Activity()
            .name(DEFAULT_NAME)
            .description(DEFAULT_DESCRIPTION)
            .startDay(DEFAULT_START_DAY)
            .endDay(DEFAULT_END_DAY)
            .role(DEFAULT_ROLE)
            .employer(DEFAULT_EMPLOYER)
            .position(DEFAULT_POSITION)
            .functions(DEFAULT_FUNCTIONS)
            .focus(DEFAULT_FOCUS);
        return activity;
    }
```
