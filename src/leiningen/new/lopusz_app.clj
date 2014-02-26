(ns leiningen.new.lopusz_app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "lopusz_app"))

(defn lopusz_app
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' lopusz_app project.")
    (->files 
        data
        ["README.org" (render "README.org" data)]
        ["TODO.org" (render "TODO.org" data)]
        [".travis.yml" (render "travis.yml" data)]
        [".gitignore"  (render "gitignore" data)]
        ["project.clj" (render "project.clj" data)]
        ["src/main/clojure/{{sanitized}}/core.clj" (render "core.clj" data)]
        ["src/test/clojure/{{sanitized}}/core_test.clj" (render "core_test.clj" data)])))
