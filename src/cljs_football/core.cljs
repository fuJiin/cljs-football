(ns cljs-football.core
  (:require [reagent.core :as r]
            [footballsimulationengine :as engine]))

(defn app []
  [:canvas
   {:id "map"
    :style {:border "1px solid #000000"
            :background "url('img/pitch.jpg')"
            :background-size "100% 100%"}}])

(defn stop []
  (println "Stopping..."))

(defn start []
  (println "Starting...")
  (r/render
   [app]
   (.getElementById js/document "app")))
