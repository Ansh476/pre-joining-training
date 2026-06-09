#Data type

is_eligible = True
is_logged_in = False

print(type(is_eligible))

#Logical operators
print(True and False)
print(True or False)
print(not True)

#boolean from expression
attendance = 85

is_eligible_for_exam = attendance >= 75
print(is_eligible_for_exam)

#conditional statement
if is_eligible_for_exam:
    print("can give exam")
else:
    print("cannot give exam")

#Truthy and falsy values

print(bool(10)) #non zero
print(bool(-10)) #non zero
print(bool(0)) 

print(bool("Python"))
print(bool("")) #empty string

print(bool([1, 2, 3]))
print(bool([]))  #empty list


#boolean in list

list1 = [1, 2, 3]
list2 = [1, 2, 3]

print(list1 == list2)
print(list1 is list2) #two seprate list

#ternary operator

age = 22

can_vote = "Yes" if age>=18 else "No" 
print(can_vote)