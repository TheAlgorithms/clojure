(ns fibonacci)

;; 
;; @function fibonacci
;; @description Fibonacci is the sum of the previous two Fibonacci numbers.
;; @param {Integer} n - The input integer.
;; @return {Integer} Fibonacci of n.
;; @see [Fibonacci_Numbers](https://en.wikipedia.org/wiki/Fibonacci_number)
;;

(defn fibonacci [n]
  (if (not (integer? n))
    (throw (IllegalArgumentException. "Input should be an integer"))
    (loop [i 1
           first-num 0
           second-num 1]
      (if (>= i n)
        second-num
        (recur (inc i) second-num (+ first-num second-num))))))