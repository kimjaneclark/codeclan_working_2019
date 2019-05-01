# counter = 0
# my_number = 5
# # conditional
# while(counter < my_number)
#   p "counter is #{counter}"
#   counter += 1
# end

# my_number = 5
# p "what number am I thinking of?"
#
# input = gets.to_i()
#
# while(input != my_number)
#   p "Wrong try again"
#   input = gets.to_i()
# end
#
# p "correct!"


# my_number = 5
# p "what number am I thinking of?"
#
# input = gets.to_i()
#
# while(input != my_number)
#   if input > my_number
#     p "Too high, try again"
#     input = gets.to_i()
#   elsif input < my_number
#     p "too low, try again"
#   input = gets.to_i()
# end
# end
# p "correct!"




# while(true)
#   p" type something"
#   input = gets.chomp()
#   break if (input.downcase =="q")
#   p "you typed #{input}"
# end

# numbers = [1,2,3,4,5]
# # for number in numbers
# #   p number * 3
# # end
#
# total = 0
# for number in numbers
#   total = total + number
# end
#
# p total



# chicken_names = ["Margaret","Hetty","Audrey","Mabel","Brian"]
# #chicken_names.push("kim")
# for name in chicken_names
#   p name
# end

chickens = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

for chicken in chickens
  if chicken[:eggs] > 0
    p "woo!"
  end
end

# for chicken in chickens
#   p"#{chicken[:name]} is #{chicken[:age]} years old"
# end

# eggs_total = 0
# for egg in chickens
#   eggs_total += egg[:eggs]
# #eggs_total = eggs_total + egg[:eggs]
# end
#
# p eggs_total
