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
        return object;
    }


> modificable:
`List<String> propNames = new ArrayList<String>(Arrays.asList("type", "standort", "name"));`


## Generic

 private <T> T[] buildArray2(T ...items) {
        return items;
    }


private BiConsumer<Query,Map<String, String>>[] buildArray(BiConsumer<Query,Map<String, String>> ...functions) {
        return functions;
    }