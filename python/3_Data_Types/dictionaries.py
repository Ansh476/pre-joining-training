#Dictionary
student = {
    "name": "Ansh",
    "age": 22,
    "cgpa": 9.21
}
print(student)
print(type(student))

#accessing values

print(student["name"])



print("Age:", student.get("age"))

#adding and updating

student["college"] = "VESIT"
student["age"] = 23

print(f"\nUpdated student details:{student}")

#removing elements

student.pop("cgpa")
print(student)

#methods
print(student.keys())
print(student.values())
print(student.items())

print(f"Total Keys: {len(student)}")

#membership operators

print("name" in student)
print("address" not in student)

#dictionary comprehension

cubes = {num: num**3 for num in range(1, 6)}
print("cubes:",cubes)

# Looping
for key, value in student.items():
    print(f"{key}: {value}")

#nested dictionaries

students = {
    "student1": {
        "name": "Ansh",
        "age": 22
    },
    "student2": {
        "name": "Omkar",
        "age": 25
    }
}

print(students["student1"]["name"])
print(students["student2"]["age"])

# Mixed datatype dictionary

student_details = {
    "name": "Ansh",
    "age": 22,
    "skills": ["Python", "Java"],
    "is_active": True,
    "address": {
        "city": "Mumbai",
        "pincode": 400083
    }
}

print(student_details["skills"])
print(student_details["address"]["city"])

#dictionary merging

branch_details = {
    "branch": "INFT",
    "div": "D20A"
}

merged_dict = student | branch_details
print(merged_dict)

#Copying
student_copy = student.copy() #solves shallow copy problem

student_copy["age"] = 30

print("Student", student)
print("Student_copy:", student_copy) 