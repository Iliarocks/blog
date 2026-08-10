(ns site
  (:require [clojure.java.io :as io]))

(def output-path "public/index.html")

(def home
  (str "<!doctype html>\n"
       "<html lang=\"en\">\n"
       "  <head>\n"
       "    <meta charset=\"utf-8\">\n"
       "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
       "    <title>Ilia</title>\n"
       "  </head>\n"
       "  <body>\n"
       "    <main>\n"
       "      <h1>Ilia</h1>\n"
       "      <p>A home for things I make with passion</p>\n"
       "    </main>\n"
       "  </body>\n"
       "</html>\n"))

(defn build! []
  (io/make-parents output-path)
  (spit output-path home)
  output-path)

(build!)

