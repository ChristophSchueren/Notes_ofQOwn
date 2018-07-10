Storage (Jhipster)
==================
> C:\Users\Christoph\SpiritInventory\node_modules\ngx-webstorage\dist\services\sessionStorage.d.ts

import { IStorage } from '../interfaces';
import { WebStorageService } from './webStorage';
export declare class SessionStorageService extends WebStorageService implements IStorage {
    constructor();
}

## Interface IStorage is cool with observables

```
import { EventEmitter } from '@angular/core';
export interface IStorage {
    store(key: string, value: any): void;
    retrieve(key: string): any;
    clear(key?: string): void;
    observe(key: string): EventEmitter<any>;
}
 
```


## Angular EventEmitter
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

## Check if Browser has storage availiable
```
import { isStorageAvailable } from 'ngx-webstorage-service';
 
const sessionStorageAvailable = isStorageAvailable(sessionStorage);
 
console.log(`Session storage available: ${sessionStorageAvailable}`);
```
