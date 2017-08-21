(ns exercise3)

(defn fibonacci
  "Returns the Fibonacci number for the x value received."
  [x]
  (if (< x 2) x (+ (fibonacci (- x 1)) (fibonacci (- x 2)))))