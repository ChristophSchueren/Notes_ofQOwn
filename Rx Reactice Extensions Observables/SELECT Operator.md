SELECT Operator
===============

```
ngOnInit(): void {
    this.store.pipe(select<any>('applicationState'))
        .subscribe((appState: ApplicationState) => console.log(appState));
}
```

…we get the following result

`{currentlyLoading: false, customerList: Array(0)}`

An object with two properties on it. But why is that? Shouldn’t it be an object (like the one from the forRoot(..)) with a property on it called applicationState?

Well, the select method in the code sample above is literally selecting the property “applicationState” and giving us back the result which is itself an object with two properties currentlyLoading and customerList on it.