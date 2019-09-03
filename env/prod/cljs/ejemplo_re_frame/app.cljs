(ns ejemplo-re-frame.app
  (:require [ejemplo-re-frame.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
