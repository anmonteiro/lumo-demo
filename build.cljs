(require '[lumo.build.api :as b])

(b/build "src"
  {:optimizations :advanced
   :target :nodejs
   :output-to "out/main.js"
   :verbose true
   :output-dir "out"})
