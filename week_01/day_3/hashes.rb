# my_first_hash = {}
# my_second_hash = Hash.new()
#
# meals = { "breakfast" => "cereal",
#           "lunch" => "roll",
#           "dinner" => "pasta"}
# #modifying or add a variable to hash
# meals["brunch"] = "avocado and espresso"
# meals["dinner"] = "pizza"
#
# # p meals.keys()
# p meals.values().include?("pizza")

# meals = {
#   :breakfast => "toast",
#   :lunch => "soup"
# }
# same as above but if using a string key still use rocket =>
# meals = {
#   breakfast: "toast",
#   lunch:"soup"
# }
#
# p meals[:breakfast]

countries = {
  uk: {capital: "London",
       population: 66000000
     },
  japan: {capital: "Tokyo",
  population: 126000000}
}


p countries[:uk][:population]
