(defproject org.clojars.the-kenny/nom "0.1.0-SNAPSHOT"
  :description "Improve your Om with Nom"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.omcljs/om "0.8.8" :scope "provided"]
                 [sablono "0.3.4"       :scope "provided"]]
  :exclusions [cljsjs/react]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.6.0"]]}})
