(ns nom.util
  (:require [cljs.core.async :as async])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(defn debounce
  ([c ms] (debounce (async/chan) c ms))
  ([c' c ms]
     (go-loop [last (<! c)]
       (let [[val port] (alts! [c (async/timeout ms)])]
         (if (= port c)
           (recur val)
           (do
             (>! c' last)
             (recur (<! c))))))
     c'))
