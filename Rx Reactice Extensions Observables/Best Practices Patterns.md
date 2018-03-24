Best Practices / Patterns
=========================

1. Observable are named myObservable$



2. Use Angular | async pipe in view
	- no need to subscribe to Observable$
	- vorher map to desired format

3. *Switch-Map* unsubscribes (good to calcel old http requests)
	- use for *autocompletion* form server (race condition problem between requests)


4. Good: Map-Operator the Data into the form you like to consume them


5. *ngRx* makes code, observable pipes with internal HTTP requests more testable
	- redux flow, common immutable state


6. keep good track of all your subscriptions and unsubscribe
	- vs code extension to highlight codeword "*subscribe*"



Mutable State Angular

Webpage Search Rxjs antipatterns list
