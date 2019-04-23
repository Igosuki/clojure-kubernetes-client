(ns kubernetes.specs.v1/config-map-node-config-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/config-map-node-config-source-data
  {
   (ds/req :kubeletConfigKey) string?
   (ds/req :name) string?
   (ds/req :namespace) string?
   (ds/opt :resourceVersion) string?
   (ds/opt :uid) string?
   })

(def v1/config-map-node-config-source-spec
  (ds/spec
    {:name ::v1/config-map-node-config-source
     :spec v1/config-map-node-config-source-data}))