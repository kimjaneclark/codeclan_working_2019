# def say_hello():
#   return "Hello world!"
#
# hi = say_hello
#
# print(hi())
#
# print(hi)
# print(say_hello())
#
#
# def function_caller(callback):
#   return callback()
#
# print(function_caller(hi))



# def outer_function():
#   def inner_function():
#     print("Hello from the inner function")
#
#   inner_function()
#
# outer_function()

#
# def make_pretty(callback):
#     def wrapper():
#         print("I am a decorated function!")
#         callback()
#     return wrapper
#
# def ordinary():
#     print("I am an ordinary function")
#
# pretty = make_pretty(ordinary)
#
# ordinary()
# pretty()


from timing import timing_function

@timing_function
def my_function():
    num_list = []
    for num in (range(0, 10000)):
        num_list.append(num)
    print("\nSum of all the numbers: " + str((sum(num_list))))

print(my_function())
