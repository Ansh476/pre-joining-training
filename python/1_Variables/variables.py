student_name = "Ansh" #snake_case
StudentName = "Ansh" #PascalCase
studentName = "Ansh" #camelCase 
studentname = "Ansh" #flatcase

#variable decleration snake_case

student_name = "Ansh"
_student_surname = "Sarfare"
student_age = 22 
student_cgpa = 9.21 
is_verified = True
student_batch3 = False

#multiple assignment

var_1,var_2,var_3 = 10,20,30

#chain assignment

var_4 = var_5 = var_6 = 50
is_eligible = is_valid = True


#swapping variables

p = 1
q = 2
p,q = q,p
print(f"value of p={p},value of q={q}")

#variable scope

global_var = "Hello, this is global"

def scopedemo():
    local_var = "Hello, this is local"
    return local_var,global_var

print(scopedemo())
