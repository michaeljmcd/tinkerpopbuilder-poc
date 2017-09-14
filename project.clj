(defproject tinkerpopbuilder-poc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.tinkerpop/gremlin-core "3.3.0"]
                 [org.apache.tinkerpop/tinkergraph-gremlin "3.3.0"]]
  :main ^:skip-aot tinkerpopbuilder-poc.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
