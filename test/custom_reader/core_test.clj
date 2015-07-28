(ns custom-reader.core-test
  (:require [clojure.test :refer :all]
            [custom.reader :refer :all]))

(deftest test-with-special-line-ending-char-has-3-lines
 (let [
   rdr (custom.java.BufferedReader. (java.io.FileReader. "resources/test.txt") \2)
  ]
  (is (= 3 (count (line-seq2 rdr))))))

  (deftest test-with-normal-line-endings
   (let [
     rdr (custom.java.BufferedReader. (java.io.FileReader. "resources/test2.txt") \2)
    ]
    (is (= 1 (count (line-seq2 rdr))))))
