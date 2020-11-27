#!/usr/bin/env python3

# By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

sum = 0
f_0, f_1 = 0, 1

while True:
 f_0, f_1 = f_1, f_0 + f_1
 if f_1 >= 4*10**6:
    break
 if f_1 % 2 == 0:
    sum += f_1

print("Solution:", sum)
  
