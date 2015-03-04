(ns nom.ui
  (:require
   ;; Necessary for the `defcomponent' macro
   om.core
   sablono.core)
  (:require-macros nom.ui))

(defn cancel-event [e]
  (doto e
    (.preventDefault)
    (.stopPropagation)))
