#implicit type conversion

#bool → int → float → complex
a = 10      
b = 2.5     
c = True
d = 3.7 + 4j
result1 = a + b  
result2 = a + c  #int(c) = 1 as it is true else 0 if false
result3 = b + d
print("int to float:",result1)
print("bool to int:",result2)
print("Float to complex:", result3)
print(f"Type: {type(result3)}")

#explicit type conversion
num1 = 10
print("\nint to float:", float(num1))

num2 = 57.9
print(f"float to int: {int(num2)}")

num3 = 85
print("int to string:", str(num3))

num4 = "100"
print("string to int:", int(num4))

num5 = "3.14"
print(f"string to float: {float(num5)}")

num6 = "4.5"
print(f"float to complex: {complex(num6)}")


#boolean conversion

print("\nbool of 'Ansh':", bool("Ansh")) #string to boolean
print("bool of empty str:", bool(""))
print(bool(10)) # int to boolean
print(bool(0))


#collection conversion

print("\nList to set:", set([11, 32, 78, 32]))
print("Set to list:", list({10, 15, 6}))

tuple_data = (67, 81, 93)
print("Tuple to list:", list(tuple_data))

list_data = [22, 33, 55]
print(f"List to tuple: {tuple(list_data)}\n")


#String to list conversion
text = "My name is Ansh"
print(list(text)) #returns list of characters

words = text.split()
print("Split words:", words) #return list

#list to string
new_text = " ".join(words)
print(f"Joined string: {new_text}")


#number conversion
print("\nBinary: of 10:", bin(num1))
print("Octal of 10:", oct(num1))
print(f"Hexadecimal of 10:: {hex(num1)}")

print("Binary to decimal:", int("0b1010", 2))
print("Octal to decimal:", int("0o12", 8))
print(f"Hexadecimal to decimal: {int('0xA', 16)}")
