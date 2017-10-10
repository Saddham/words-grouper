## Test assignment for job interview invitation

The original version in Russian: [README-ru.md](../master/README-ru.md)

### Problem formulation

Input string consists of words. All words in this string are separated by 
a single space. The string needs to be transformed into a data structure 
that groups words by the first letter.

Then only groups that contain more than one element need to be output. 
Groups need to be sorted in alphabetical order. Words in a group 
need to be sorted in descending order (by the number of characters);
if the number of characters is equal, then sort need to be done in 
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

1) Selected output data structure is `Map<String, List<String>>` that
can easily be transformed to `Set`.
_Such transformation can be necessary to match the output from the example.
(`Map` is converted to a string as `"{k1=v1, k2=v2, ...}"`, whereas data 
structures that implements `Collection` interface are converted to a string
as `"[e1, e2, ...]"`)_
 
2) If the input string is `null` or empty then empty data structure is returned.

3) Duplicates and characters register in words are ignored.

4) The conditions, by which words are grouped and groups are sorted and filtered,
are not extracted as parameters (for simplicity).
