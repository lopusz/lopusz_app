(defproject {{name}} "0.1.0-SNAPSHOT"

  ; GENERAL OPTIONS

  :description "description"
  :url "url"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot :all
  :omit-source true

  :main {{name}}.core
  ;; Options used by Java
  ;;; run with assertions enabled
  :jvm-opts ["-ea"]
 
  ; DEPENDENCIES

  :dependencies [
    [org.clojure/clojure "1.5.1"]
 
    ;; Runtime assertions
    [pjstadig/assertions "0.1.0"]]
  
  ; SOURCE DIRECTORY RECONFIGURATION

  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clojure"]
  
  ; PLUGINS + CONFIGURATION

  :plugins [ [codox "0.6.7"] ]

  ;; codox configuration

  :codox {
          :output-dir "target/apidoc"
          :sources [ "src/main/clojure"]
          ;; Uncomment this to get github links in sources
          ;; :src-dir-uri "githubrepo/blob/master/"
          ;; :src-linenum-anchor-prefix "L"
          }
)