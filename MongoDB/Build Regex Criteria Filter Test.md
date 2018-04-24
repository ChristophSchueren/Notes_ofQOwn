Build Regex Criteria Filter Test
================================
```
private void regexFilterTest0(Query query, Map<String, String> reqParams) {
       Criteria result = Criteria.where("nutzerLogin").regex("^" + "ann"); // ann*
       query.addCriteria(result);
    }

    private void regexFilterTest2(Query query, Map<String, String> reqParams) {
       Criteria result = Criteria.where("nutzerLogin").regex("^" + "ann|^b"); // ann* b*
       query.addCriteria(result);
    }
    private void regexFilterTest(Query query, Map<String, String> reqParams) {
       Criteria result = Criteria.where("nutzerLogin").regex("^" + "annahoffmann$"); // NICHT annahoffmans !!!
       query.addCriteria(result);
    }
```

