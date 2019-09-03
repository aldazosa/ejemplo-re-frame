(ns ejemplo-re-frame.figwheel
  (:require [figwheel-sidecar.repl-api :as ra]))

(defn start-fw []
  (ra/start-figwheel!))

(defn stop-fw []
  (ra/stop-figwheel!))

(defn cljs []
  (ra/cljs-repl))

