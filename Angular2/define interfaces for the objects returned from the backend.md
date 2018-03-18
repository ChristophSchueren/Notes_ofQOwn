define interfaces for the objects returned from the backend
===========================================================

```
export interface Race {
    id: number,
    name: string,
    ponies: Array<Pony>,
    startInstant: string,
    status: RaceStatus
}
```

getRaceById(id): Observable<Race> {
        return this._http.get(`/api/races/${id}`)
                         .map(response => response.json());
    }