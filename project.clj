(defproject fizzbuzz-clj "0.1.0"
  :description "FizzBuzz in Clojure"
  :url "https://github.com/marksilvis/fizzbuzz-clj"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot fizzbuzz-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
