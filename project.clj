(defproject clj-dynamodb-local "0.1.3-SNAPSHOT"
  :description "A Leiningen plugin and boot task for providing a local DynamoDB instance"
  :url "https://github.com/dmcgillen/clj-dynamodb-local"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[boot/core "2.6.0" :scope "provided"]
                 [environ "1.0.0"]
                 [medley "1.0.0" :scope "test"]
                 [net.lingala.zip4j/zip4j "2.11.5"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :creds :gpg}]])
