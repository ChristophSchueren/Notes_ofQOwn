String Helpers
==============

```
```
private String removeLeadingDollar(String dollarField) {
        return dollarField.replaceAll("^\\$+", "");
    }


private String removeLeadingDollar(String dollarField) {
        if (StringHelper.isNullOrEmptyString(dollarField)) {
            return dollarField;
        }
        if (dollarField.charAt(0) == '$'){
            return dollarField.substring(1);
        }
        return dollarField;
    }
```

> in aggregation

new ProjectionOperation().and(removeLeadingDollar(dollarField)), // FIXME

```
