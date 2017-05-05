(ns fizzbuzz-clj.core
  (:gen-class))

(defn fizzbuzz [x]
  "Get FizzBuzz for value"
  (cond
    (zero? (mod x 15)) "FizzBuzz"
    (zero? (mod x 3))  "Fizz"
    (zero? (mod x 5))  "Buzz"
    :else  x))

(defn -main [& args]
  "Print results of FizzBuzz"
  (try
    (def bound (Integer/parseInt (first args)))
    (doseq [n (map fizzbuzz (range 1 (inc bound)))]
      (println n))
    (catch Exception e (println "Error: integer required"))))
