#basic try-except

try:
    num = int(input("enter a number: "))
    print("input number:", num)
except ValueError:
    print("invalid number")

#specific error handling

try:
    result = 10 / 0
    print(result)
except ZeroDivisionError:
    print("cannot divide by zero")


#multiple except 
try:
    num1 = int(input("enter first number: "))
    num2 = int(input("enter second number: "))
    result = num1 / num2
    print("result:", result)
except ValueError:
    print("invalid input")
except ZeroDivisionError:
    print("cannot divide by zero")    


#else 
try:
    age = int(input("enter your age: "))
except ValueError:
    print("invalid input")
else:
    print("My age is", age)

#finally block
try:
    print("course started..")
    x = 50 / int(input("enter a number: "))

except ZeroDivisionError:
    print("Error")

finally:
    print("course completed..")


#except as e
try:
    x = 4 / int(input("enter number: "))
except ZeroDivisionError as e:
    print("Error:", e)
except ValueError as e:
    print("Invalid input:", e)

#raise

def check_mileage(mileage):
    if mileage < 0:
        raise ValueError("mileage cannot be negative")
    print("Valid mileage")

try:
    check_mileage(-5)
except ValueError as e:
    print("error:", e)


#custom exception

class InvalidMarksError(Exception):
    pass
def check_marks(marks):
    if marks < 0 or marks > 100:
        raise InvalidMarksError("invalid marks")
    print("Valid marks")
try:
    check_marks(105)
except InvalidMarksError as e:
    print("error:", e)


#assertion error
def withdraw(balance,amount):
    assert amount <= balance, "insufficient balance"
    balace -= amount
    print("withdraw successful, remaining balance:", balance)

try:    
    withdraw(1000, 1500)
except AssertionError as e:
    print("error:", e)
    

#multiple exception catching
try:
    height = int(None) #gives TypeError
    #weight = int("abc") #gives ValueError

except (ValueError, TypeError) as e:
    print("error:", e)

#nested try-except

try:
    balance = 10000
    
    try:
        amount = int(input("enter amount: "))
    except ValueError as e:
        print("error:", e)
        
    if amount > balance:
        raise Exception("insufficient balance")
    
    balance -= amount
    print("withdraw successful, remaining balance:", balance)

except Exception as e:
    print("error:", e)