# shopping_list = ["milk", "bacon", "eggs"]
# for item in shopping_list:
#     print(item)
# print ("That's the end of the shopping list!")
#
# for x in range(1, 11):
#     print(x)


# counter = 0
# while(counter < 10):
#     print(counter)
#     counter = counter + 1

# today = "Friday"
# if today == "Saturday" or today == "Sunday":
#     print("lie in")
# elif today == "Friday":
#     print("nearly there")
# else:
#     print("work")
#
# print("Anyhoo")


# numbers = range(1, 11)
# evens_squared = []
# for number in numbers:
#     if number % 2 == 0:
#         evens_squared.append(number * number)
#
# print(evens_squared)



# evens_squared = [number*number for number in range(1, 11) if number % 2 ==0]
# print(evens_squared)




ages = [5, 15, 64, 27, 84, 26]
total = 0
for age in ages:
    total = total + age
print(total)

average = total / len(ages)
print(average)


words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
letters = [word[0].lower() for word in words]
print(letters)

pupils = ["Alison", "James", "Stephen", "Mandy", "Henry"]
for pupil in pupils:
    if pupil == "Jack":
        print("Jack is included")
    else:
        print("nah")
