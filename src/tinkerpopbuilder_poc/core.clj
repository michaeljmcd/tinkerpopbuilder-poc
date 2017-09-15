(ns tinkerpopbuilder-poc.core
  (:import (org.apache.tinkerpop.gremlin.tinkergraph.structure TinkerGraph)
           (org.apache.tinkerpop.gremlin.structure.io IoCore))
  (:gen-class))

(defn -main
  "Build a simple graph of The Shadow's agents and write it out to a .kryo file"
  [& args]
  (let [g (TinkerGraph/open)
        shadow-vertex (-> g (.addVertex (into-array ["name" "The Shadow"])))
        moe-vertex (-> g (.addVertex (into-array ["name" "Moe Schrevnitz"])) (.addEdge "drives for" shadow-vertex (into-array [])))]
    (-> (.io g (IoCore/gryo)) (.writeGraph "the-shadow.kryo"))
  )
  )
