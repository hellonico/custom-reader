(ns custom.reader)

  (defn line-seq2
    "Returns the lines of text from rdr as a lazy sequence of strings."
    [^custom.java.BufferedReader rdr]
    (when-let [line (.readLine rdr)]
      (cons line (lazy-seq (line-seq2 rdr)))))
