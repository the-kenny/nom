(defproject org.clojars.the-kenny/nom "0.1.2-SNAPSHOT"
  :description "Improve your Om with Nom"
  :url "https://github.com/the-kenny/nom"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.omcljs/om "0.8.8" :scope "provided"]
                 [sablono "0.3.4"       :scope "provided"]]
  :exclusions [cljsjs/react]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.6.0"]
                                       [org.clojure/core.async "0.1.346.0-17112a-alpha"]]}}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
