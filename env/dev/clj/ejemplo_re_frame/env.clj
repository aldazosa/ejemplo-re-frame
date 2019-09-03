(ns ejemplo-re-frame.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [ejemplo-re-frame.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[ejemplo-re-frame started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[ejemplo-re-frame has shut down successfully]=-"))
   :middleware wrap-dev})
