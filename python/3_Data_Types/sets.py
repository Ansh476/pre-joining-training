#Set is unordered and contains unique elements
set1 = {65, 46, 70, 90, 70}
print(set1) # duplicate values removed
print(type(set1))

#Empty Set

empty_set = set()
print(type(empty_set))

#adding elements

set1.add(88)
print(set1)

#removing elements

set1.remove(46)
#set1.remove(21) - gives error as num not present
print(set1)
set1.discard(21)  #no error even if num not present
set1.discard(88)  
print(set1)

# Membership Operators

print(90 in set1)
print(65 not in set1)

print(len(set1))

#Set comprehension
squarednums = {num**2 for num in set1}
print("Squared set1 Set:", squarednums)

#Looping
for num in set1:
    print("num:", num)

# Set Operations
a = {1, 2, 3}
b = {3, 4, 5}

print("Union:", a.union(b))
print("intersection:", a.intersection(b))
print("difference:", a.difference(b))
print("sym_difference:", a.symmetric_difference(b))

#Using logical operators
print("Union:", a | b) 
print("intersection:", a & b)  
print("difference:", a - b)   
print("sym_difference:", a ^ b)   

#subset and superset
set2 = {65,70}
print(set2.issubset(set1))
print(set1.issuperset(set2))

#Mixed datatype set

mixed_set = {"Ansh", 22, True}
print(mixed_set)

#set from list

set3 = [10,10,20,30,40,40,70,80]
unique_nums = set(set3)
print("unique_nums:",unique_nums)

#copying
set4 = set1 
print(set1==set4)
set1.add(11)
print(f"Set1:{set1} ,\nSet4:{set4}") #shallow copy problem

set4 = set1.copy()
set1.add(99)
print(f"Set1:{set1} ,\nSet4:{set4}") 