pets = [
{
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
},
{
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
},
{
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
},
{
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
}
]

# # Print out all of the names using a loop
# for pet in pets
#   print pet[:name]
# end


# Print out all of the names using an enumerable
# pets.each {|pet| p pet[:name]}


# Find a pet using a loop and if statement

# for pet in pets
#   if pet[:name] == "Merlin"
#     print pet
#   end
# end

# Find a pet using an enumerable

# p pets.find {|pet| pet[:name] == "Merlin}


  # pets.find do |pet|
  #   if pet[:name] == "Tristan"
  #   p pet[:breed]
  # end

## 1. Find the pet which breed is Husky

# p pets.find {|pet| pet[:breed] == "Husky"}


## 2. Make an array of all of the pets' names
# pet_names = []
# pets.each {|pet| pet_names << pet[:name]}
# p pet_names

#p pets.map {|pet| pet_names << pet[:name]}


# ## 3. Find out if there are any pets of breed 'Dalmation' (true or false)
# p pets.all? {|pet| pet[:breed] == "Dalmation"}
#
# ## 4. Find the most expensive pet i.e. pet with the highest/maximum price
# p pets.max {|pet, next_pet| pet[:price] <=> next_pet[:price]}

# p pets.sort_by {|pet| pet[:price]}.last
#
# ## 5. Find the total value (price) of all of the pets added together.
# p pets.sum {|pet| pet[:price]}

## 6. Change each pet so their price is 50% cheaper

p pets.each do |pet|
  pet[:price] = pet[:price] / 2.0
end

p pets.each { |pet| pet[:price] /=2 }
