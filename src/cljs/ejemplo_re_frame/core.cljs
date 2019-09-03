(ns ejemplo-re-frame.core
  (:require
    [reagent.core :as r]
    [re-frame.core :as rf]
    [ejemplo-re-frame.events]))

(defn page []
  [:p :hola])

;; -------------------------
;; Initialize app
(defn mount-components []
  (rf/clear-subscription-cache!)
  (r/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (mount-components))
