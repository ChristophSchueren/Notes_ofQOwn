EventEmitter
============
in @angular\core\src\event_emitter.d.ts

### Methoden:
emit
subscribe

```

export declare class EventEmitter<T> extends Subject<T> {
    __isAsync: boolean;
    /**
     * Creates an instance of {@link EventEmitter}, which depending on `isAsync`,
     * delivers events synchronously or asynchronously.
     *
     * @param isAsync By default, events are delivered synchronously (default value: `false`).
     * Set to `true` for asynchronous event delivery.
     */
    constructor(isAsync?: boolean);
    emit(value?: T): void;
    subscribe(generatorOrNext?: any, error?: any, complete?: any): any;
}
```
