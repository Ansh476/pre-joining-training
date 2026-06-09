
frontend = ("React", "Angular", "Next.js")

print(type(frontend))

#Accessing elements

print(frontend[0])
print(frontend[1])
print(frontend[-2])
print(frontend[-1])

#Tuple slicing

print(frontend[0:2])
print(frontend[1:])
print(frontend[::-1])
print(frontend[::2])

#Tuple methods
print(len(frontend))
print(frontend.count("React"))
print(frontend.index("Angular"))

#Membership operators

print("Dart" in frontend)
print("Node.js" not in frontend)

#Looping
for framework in frontend:
    print(framework)

#Tuple concatenation
backend = ("Node.js", "Express.js")

web_dev = frontend + backend
print(web_dev)

#Nested tuples

students = (
    ("Ansh", 22),
    ("Ashish", 50))

print(students[0][1])
print(students[1][0])

#Single element tuple

single_value = ("React",) #without ','(comma) it gives type=string
print(type(single_value))

#Mixed datatype tuple

mixed_tuple = ("React", 36, 80.52, True)
print(mixed_tuple)

#tuple Packing and unpacking

person = "Ansh", 22, "VESIT"
print(person)

name, age, college = person
print(name)
print(age)
print(college)

#tuple immutabilty
# frontend[2] = "Vue.js"  - gives error