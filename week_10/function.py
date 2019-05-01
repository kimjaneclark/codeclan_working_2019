# def hello_world():
#     return "hello world"
#
# print (hello_world())
#
# def set_alarm(day):
#     if (day == "Saturday" or day == "Sunday"):
#         return None
#     else:
#         return "7:00"
#
# print (set_alarm("Monday"))


# def add(a, b = 2):
#     return a + b
#
# result = add(a = 2, 4)
# print(result)

# result = add(2, 10)
# print(result)

# def add(a, b):
#     return a + b
#
#
# my_list = [4]
# my_dictionary = {"b": 2}
# result = add(*my_list, **my_dictionary)
# print(result)


def my_function(*args, **kwargs):
    print(args)
    print(kwargs)

my_function("spam", "ham", "eggs", foo = "bar", baz = "bam")


def add(*args):
    total = 0
    for arg in args:
        total += arg
    return total

print(add(3, 4, 5, 6, 7))
print(add(5, 10))
