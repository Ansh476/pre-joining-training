#function without params

def greet():
    print("Hello world\n")
greet()

#function with params

def greet_user(name):
    print(f"Hello {name}\n")

greet_user("Ansh")

#function with return value

def add(a, b):
    return a+b
result = add(49,74)
print(result)

#default parameters

def greet_func(name="Guest"):
    print(f"\nHello {name}\n")
greet_func()
greet_func("Ansh")

#keyword arguments

def student_info(name,age,branch):
    print(f"Name: {name}, Age: {age}, Branch: {branch}\n")

student_info(age=22, name="Ansh", branch="INFT")
student_info("Ansh", branch="INFT", age=22) #positional arg

#return multiple values

def get_student_details():
    name = "Ansh"
    age = 22
    branch = "INFT"
    return name, age, branch

ans = get_student_details()
print(ans) #return tuple

def get_student_info():
    return "Ansh", 22, "INFT"

name,age,branch = get_student_info() #tuple unpacking
print(name,age,branch)

#args (variable number of pos args)  returns tuple
def languages(*langs):
    print("Languages known:", langs)

languages("Python", "Java", "C")

def multiply(*nums):
    result = 1
    for num in nums:
        result *= num
    print(result)

multiply(2,4,6)


#kwarsgs (variable number of keyword args)  returns dict

def student_details(**details):
    print("Student details:", details)

student_details(name="Ansh", age=22, branch="INFT")

#args and kwargs together

def student_info(name,*skills,**details):
    print(name, skills, details)
student_info("Ansh", "Python", "Java", age=22, college="VESIT")

#function calling another function
def division(a,b):
    return a//b

def subtract (c,d):
    return c - division(c,d)

soln = subtract(10,2)
print(soln)

#recursive function
def factorial(n):
    if n == 0 or n == 1:
        return 1

    return n * factorial(n - 1)
print("\nFactorial:", factorial(7))

## Lambda Function

square = lambda x: x ** 2
print("\nSquare:", square(9))

#func with list comprehension

def cube(nums):
    return [num**3 for num in nums]
    #return list(map(lambda x: x**3, nums)) 

print("\nCube:", cube([2, 3, 4]))

#nested function

def outer_func(num):
    def inner_func():
        return num % 5
    return inner_func()

result = outer_func(49)
print("\nNested function result:", result)

#type-hints
def percentage(a: int, b: int) -> float:
    percentage = (a / b) * 100 
    return percentage

print(f"percentage: {percentage(234,789):.2f} %")

# Docstring

def calculate_area(length, width):
    "returns area of rectangle."
    return length * width

print(calculate_area(10, 5))
print(calculate_area.__doc__)
