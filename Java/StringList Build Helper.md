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

List<String> propNames = new ArrayList<String>(Arrays.asList("type", "standort", "name"));