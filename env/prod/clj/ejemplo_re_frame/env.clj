(ns ejemplo-re-frame.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[ejemplo-re-frame started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[ejemplo-re-frame has shut down successfully]=-"))
   :middleware identity})
