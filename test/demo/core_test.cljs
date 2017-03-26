(ns demo.core-test
  (:require [clojure.test :refer [deftest is run-tests]]
            [demo.core :as demo]))

(deftest test-demo
  (is (= (demo/add 1 2) 3)))

(defn -main [& args]
  (run-tests))
