# import random
#
# class LotteryMachine:
#
#     def __iter__(self):
#         self.numbers = []
#         return self
#
#
#     def __next__(self):
#         if len(self.numbers) == 6:
#             raise StopIteration
#         else:
#             number = random.randint(1, 49)
#             if number not in self.numbers:
#                 self.numbers.append(number)
#                 return number


# numbers = range(11)
#
# print(numbers)


def generate_evens(n):
    i = 0
    while i < n:
        if i % 2 == 0:
            yield i
        i = i + 1

print(list(generate_evens(10)))
