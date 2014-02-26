(ns {{name}}.core
  (:refer-clojure :exclude [assert])
  (:require
     [ pjstadig.assertions :refer [assert]])
  (:gen-class))


(defn -main 
  "Main function of the project."
  [ & args ]
  (println "Hello world!"))

