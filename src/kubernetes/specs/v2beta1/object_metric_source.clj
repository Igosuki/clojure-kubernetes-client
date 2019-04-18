(ns kubernetes.specs.v2beta1/object-metric-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v2beta1/cross-version-object-reference :refer :all]
            )
  (:import (java.io File)))


(def v2beta1/object-metric-source-data
  {
   (ds/req :metricName) string?
   (ds/req :target) v2beta1/cross-version-object-reference-spec
   (ds/req :targetValue) string?
   })

(def v2beta1/object-metric-source-spec
  (ds/spec
    {:name ::v2beta1/object-metric-source
     :spec v2beta1/object-metric-source-data}))