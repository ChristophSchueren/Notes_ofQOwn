Observable Operators
====================

einfachste Observable:

`Observable.of(123);`


concatMap()

```
function get() {
    let req: HttpRequest<any> = new HttpRequest<any>();
    const events$ = of(req).pipe(concatMap((req: HttpRequest<any>) => {
        // running request through interceptors chain
        this.handler.handle(req);
    }));
    return $events;
}
```
