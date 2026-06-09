positive_int = 75
negative_int = -75
zero = 0

print(f"Integer types: {positive_int}, {negative_int}, {zero}")

#Integer arthmetic operations 
a = 10
b = 5
print("Addition:", a + b)
print("Subtraction:", a - b)
print("Multiplication", a * b)
print("Division", a / b)
print("Floor Division", a // b)
print("Modulus", a % b)
print("Exponentiation", a ** b)

#Comparison operations
print(a == b)
print(a <= b)
print(a >= b)
print(a != b)
print(a < b)
print(a > b)

#bitwise operators
print("AND:", a & b)
print("OR:", a | b)
print("XOR:", a ^ b) 
print("NOT:", ~a )
print("left_shift:", a << b) # a * 2^b
print("right_shift:", a >> b) # a // 2^b


#integer functions
num = -16
print(abs(num))
print(pow(num,3)) 
print(divmod(num,-4)) # returns (quotient,remainder)

#number systems

binary_num = 0b1011
octal_num = 0o13
hex_num = 0xB

print(f"binary_num: {binary_num}, octal_num: {octal_num}, hex_num: {hex_num}")

#large integers

large_num = 1234567890987654321
print(large_num)
print(type(large_num))

net_amount = 1_20_00_000 
print(net_amount)