(ns exercise2)

(defn only-greater-than-five
  "Receives a list and returns it containing those elements that are greater than five."
  [x]
  (filter (fn [v] (> v 5)) x))
