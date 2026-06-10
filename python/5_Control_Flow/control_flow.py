#if-else example
print("if-else example")
Branch = "INFT"

if Branch == "CSE" or Branch == "INFT":
    print("Practical lab : 501\n")
else:
    print("Practical lab : 502\n")

# if-elif-else example
print("if-elif-else example")
Roll_no = 35

if Roll_no < 20 :
    print("examination hall: 110\n")
elif Roll_no > 20 and Roll_no <= 40:
    print("examination hall: 111\n")
elif Roll_no > 40 and Roll_no <= 50 :
    print("examination hall: 112\n")
else:
    print("examination hall will be allocated\n")

#nested if-else example
print("nested if-else example")
age = 22
has_license = True

if age >= 18:
    print("you are eligible to drive")
    if has_license:
        print("you can drive\n")
    else:
        print("you need a license to drive\n")
else:
    print("you are not eligible to drive\n")

#Ternary operator
print("Ternary operator")
num = 19
result = "Even" if num % 2 == 0 else "Odd"
print(f"{num} is {result}\n")

#for loop with range
print("for loop with range")
for i in range(1, 6):
    print("number:",i)

#while loop
print("\nwhile loop")
count = 1
while count <= 5:
    print("Count:", count)
    count += 1

#break 

print("\nbreak")

for num in range(1, 6):
    if num == 3:
        print("breaking the loop at number 3")
        break
    print("num:", num)

#continue

print("\ncontinue")

for num in range(1, 6):
    if num %2 == 0:
        print("skipping even num:", num)
        continue
    print("num:", num)

#pass

print("\npass")
for num in range(1, 6):
    if num == 3:
        pass #placeholder for future code
    print("num:", num)

#for-else

print("\nfor-else:")

target = 5
for num in [2, 4, 6, 8, 10]:
    if num == target:
        print("target found\n")
        break
else:
    print(f"{target} not found in list\n")

#while-else

print("\nwhile-else:")
attempt = 1
while attempt <= 3:
    print(f"attempt no: {attempt}")
    attempt += 1
else:
    print("All attempts completed try later\n")

#nested loops
print("\nnested loops:")
for i in range(1,4):
    for j in range(1,4):
        print(f"({i}, {j})", end=" ") #end keeps output on the same line
    print() #for new line after inner loop

#looping through string
print("\nlooping through string:")
name = "Ansh"
for char in name:
    print(char, end=" ") #prints Ansh with space

