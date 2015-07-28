# custom-reader

A Clojure library designed to ... well, that part is up to you.

## Usage

See the test examples:

With file test.txt
```
thisisaline 2thisisanotherline2thisisathirdline
```

This gives:
```
(deftest test-with-special-line-ending-char-has-3-lines
 (let [
   rdr (custom.java.BufferedReader. (java.io.FileReader. "resources/test.txt") \2)
  ]
  (is (= 3 (count (line-seq2 rdr))))))
```
And with a regular file:

```
this is
counted
as
only one line
```

This gives

```
  (deftest test-with-normal-line-endings
   (let [
     rdr (custom.java.BufferedReader. (java.io.FileReader. "resources/test2.txt") \2)
    ]
    (is (= 1 (count (line-seq2 rdr))))))
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
