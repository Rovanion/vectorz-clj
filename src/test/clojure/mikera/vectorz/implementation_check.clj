(ns mikera.vectorz.blank
  (:use clojure.core.matrix)
  (:require [clojure.core.matrix.utils :as utils]))

(set-current-implementation :vectorz)

(defn test []
	(array [1])
	
	(def protos (utils/extract-protocols))
)