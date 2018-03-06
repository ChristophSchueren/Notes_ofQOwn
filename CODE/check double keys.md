check double keys
=================
```
  private checkIfArrayIsUnique(myArray) {
    return myArray.length === new Set(myArray).size;
  }
```

  private checkIfKeysAreUniqueAlt(arrWithKey: Array<{key : String}>): boolean {
      const set = new Set();
      for (const iterator of arrWithKey) {
        // '' ist ein key, der merfach vorkommen darf, aber nicht muss
        if (iterator.key === null || iterator.key === '') { continue; }
        const addAllowed = set.add(iterator.key);
        if ( !addAllowed ) { return false; }
    }
    return true;
  }

  private getDoubleKeyIfExists(arrWithKey: Array<{key : String}>): String {
      const set = new Set<String>();
      for (const iterator of arrWithKey) {
        // '' ist ein key, der merfach vorkommen darf, aber nicht muss
        if (iterator.key === null || iterator.key === '') { continue; }
        const addAllowed = set.add(iterator.key);
        if ( !addAllowed ) { return iterator.key; }
    }
    return null;
  }