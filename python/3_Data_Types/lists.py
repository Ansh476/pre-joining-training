# List Data Type

languages = ["Java", "Python", "Javascript"]
print(type(languages))

# Accessing Elements

print(languages[0]) 
print(languages[1])
print(languages[-2])
print(languages[-1]) 

# List Slicing
print(languages[0:2])
print(languages[1:])
print(languages[::-1])
print(languages[::2]) #every second element

#Adding elements

languages.append("C") # at end
languages.insert(1, "C++") 
languages.extend(["Go", "Rust"])
print(languages[:]) # print(languages[::]) same output

#removing elements
languages.remove("C")
languages.pop() #removes last element
print(languages)

#updating elements
languages[1]="PHP"
print(languages)

#list methods
print(len(languages))
print(languages.count("Java"))
print(languages.index("Go"))

#membership operators
print("python" in languages) #case-sensitive
print("Python" in languages)
print("C" not in languages)

#sorting and reversing
languages.sort()
print(languages)

languages.sort(reverse=True)
print(languages)

languages.reverse()
print(languages)

#Looping through list
for lang in languages:
    print(lang)

#list concatenation
CSS_frameworks = ["Tailwind", "Bootstrap"]
combined_list = languages + CSS_frameworks
print(combined_list)

#nested lists

matrix = [
    [1, 2],
    [3, 4] ]    
print(matrix[0][1])
print(matrix[1][0])

#List Comprehension
squares = [num ** 2 for num in range(1, 6)]
print(squares)

#List copying
languages_copy = languages.copy()  #- only one will change
#languages_copy = languages   - both will change if any one updates
languages[3]="C++"
print(languages)
print(languages_copy) 