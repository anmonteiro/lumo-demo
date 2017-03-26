(ns demo.core
  (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(def left-pad (js/require "left-pad"))

;; pad the number 42 with five zeros
(println "padded 42:" (left-pad 42 5 0))


(defn add [& args]
  (apply + 1 args))
