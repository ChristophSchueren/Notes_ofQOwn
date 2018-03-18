race
====

import {raceStatic} from "rxjs/operator/race";

raceStatic(
    Observable.fromEvent(element1, "event1"),
    Observable.fromEvent(element2, "event2")
  )
.map(...);