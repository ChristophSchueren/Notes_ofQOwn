String Hashmap Helpers
======================

/** HELPERS */


```
private String[] getParamNames (Map<String, String> reqParams) {
        return reqParams.keySet().stream().toArray(String[]::new);
    }
```


```
    /**
     * Helper
     */

    private String extractValue(Map<String,String> reqParams, String key) {
        if (!reqParams.containsKey(key)) { return null; }
        return reqParams.get(key);
    }

    /**
     * Helper to get
     * aus reqParams JSON {alreadyTypedString: wert}
     */

    private String extractAlreadyTypedString(Map<String,String> reqParams) {
        return extractValue(reqParams, "alreadyTypedString");
    }
}
```
