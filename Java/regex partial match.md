regex partial match
===================

works:

```
List<String> result = new LinkedList<String>();

        Pattern pattern = Pattern.compile(getFirstLetterInversionRegex(alreadyTypedString));

        result.addAll(this.values.stream()
            .filter(n -> pattern.matcher(n).find())  // n.matches(getFirstLetterInversionRegex(alreadyTypedString))) nur true bei ganzem String match
            .collect(Collectors.toList()));
        return result;
```
