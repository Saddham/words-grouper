## Test assignment for job interview invitation

The original version in Russian: [README-ru.md](../master/README-ru.md)

### Problem formulation

Input string consists of words. All words in this string are separated with 
single spaces. The string should be transformed into a data structure 
that groups words by first letters.

Then groups which contain more than one element should be output. 
Groups should be sorted in alphabetical order. Words in each group 
should be sorted in descending order (by number of characters);
if the numbers of characters are equal, then sorting should be done in 
alphabetical order.

Example string:
```
String s = "drink dogs office beach blur berry";
```

Sorted string:
```
[b=[beach, berry, blur], d=[drink, dogs]]
```

### Assumptions

1) Chosen output data structure is `Map<String, List<String>>` which
can easily be transformed to `Set`.
_Such transformation might be required to match output from the example.
(`Map` is converted to a string as `"{k1=v1, k2=v2, ...}"`, whereas data 
structures which implement `Collection` interface are converted to a string
as `"[e1, e2, ...]"`)_
 
2) If input string is `null` or empty then empty data structure is returned.

3) Duplicates and characters' register in words are ignored.

4) Rules, by which words are grouped and rules for sorting and filtering of groups,
are not considered as parameters (for simplicity).
