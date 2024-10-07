(ns fibonacci-test
  (:require [clojure.test :refer :all]
            [fibonacci :refer [fibonacci]]))

(deftest test-fibonacci
  ;; Testing for invalid type
  (testing "Testing for invalid type"
    (is (thrown? IllegalArgumentException (fibonacci "0")))
    (is (thrown? IllegalArgumentException (fibonacci "12")))
    (is (thrown? IllegalArgumentException (fibonacci true))))

  (testing "fibonacci of 0"
    (is (= 0 (fibonacci 0))))

  (testing "fibonacci of 1"
    (is (= 1 (fibonacci 1))))

  (testing "fibonacci of 10"
    (is (= 55 (fibonacci 10))))

  (testing "fibonacci of 25"
    (is (= 75025 (fibonacci 25)))))
