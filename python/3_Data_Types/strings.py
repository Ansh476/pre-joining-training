import math

student_name = "Ansh Sarfare"
student_branch = "Information technology"

print("name:", student_name)
print("branch:", student_branch)

#quotes and multi-line

single_quote_message = '\nHe wished,"Good Morning" to everyone'
double_quote_message = "He wished, Good Morning to everyone"
multi_line_message = """He wished, 
Good morning to
everyone"""

print(single_quote_message)
print(double_quote_message)
print(multi_line_message)

#next line using \n
print("\nHello\nWorld\n")

#raw string
path = r"C:\Users\Ansh\Documents\Python"
path2= "C:\\Users\\Ansh\\Documents\\Python"
print(path)
print(path2)

#String concatenation
full_message = f"\n{student_name} is student of {student_branch} branch\n"
print(full_message)

#String indexing
print(student_name[0])
print(student_name[6])
print(student_branch[-1])

#String slicing
print(student_name[0:4])
print(student_name[5:])
print(student_name[::-1])

#String membership
print("sh" in student_name)
print("gp" in student_branch)

#String comparison
student_name2 = "Ansh Sarfare"
print("\nAre the strings equal:", student_name == student_name2) 

#String Methods
print("\nString methods")
print(student_name.upper())
print(student_name.lower())

subj = " cloud computing "
print(subj.title())
print(subj.strip())
print(subj.split())
print(subj.replace("cloud", "edge"))

subj2 = "cloud computing"
print(len(subj)) #counts spaces 
print(len(subj2)) 

print("Python".isalpha())
print("956".isdigit())
print("id21".isalnum())
print(subj2.islower())
print("ABC".isupper())

#F-strings
age = 22
print(f"My name is {student_name} and I am {age} years old")
print(f" I was {age - 7} years old when I was in 10th std")

#f-string formatting
print(f"pi:{math.pi:.2f}")
print(f"pi:{math.pi:.3f}")

cost = 50375000
print(f"cost:{cost:,}")

#string immutabilty
# student_branch[3] = "M"  - gives error