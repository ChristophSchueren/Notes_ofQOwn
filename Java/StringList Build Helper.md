StringList Build Helper
=======================

```
private List<String> newStringList(String ...strings) {
        return Arrays.asList(strings);
    }
```
private List<String> newStringList(String ...strings) {
        return Arrays.asList(strings); //IMmodificable
    }

private T[] newArray(T ...object) {
        return Arrays.asList(strings); //IMmodificable
    }


> modificable:
`List<String> propNames = new ArrayList<String>(Arrays.asList("type", "standort", "name"));`