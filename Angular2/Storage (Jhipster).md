Storage (Jhipster)
==================
> C:\Users\Christoph\SpiritInventory\node_modules\ngx-webstorage\dist\services\sessionStorage.d.ts

import { IStorage } from '../interfaces';
import { WebStorageService } from './webStorage';
export declare class SessionStorageService extends WebStorageService implements IStorage {
    constructor();
}

## Interface IStorage is cool with observables

import { EventEmitter } from '@angular/core';
export interface IStorage {
    store(key: string, value: any): void;
    retrieve(key: string): any;
    clear(key?: string): void;
    observe(key: string): EventEmitter<any>;
}
 

## Angular EventEmitter

