chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]

def count_eggs(chickens)
  total_eggs = 0

  for chicken in chickens
    total_eggs += chicken[:eggs]
    chicken[:eggs] = 0
  end

  return total_eggs.to_s() + " eggs collected"
end

# p count_eggs(chicken_hashes)
# p chicken_hashes

# for chicken in chicken_hashes
#   if chicken[:name] =="Audrey"
#     p "I found Audrey"
#   end
# end

# def find_chicken_by_name(chickens, name)
#   for chicken in chickens
#     if chicken[:name] == name
#       p "I found #{name}"
#     end
#   end
# end
#
# find_chicken_by_name(chicken_hashes,"Hetty")
# find_chicken_by_name(chicken_hashes,"Audrey")

def find_chicken_by_name(chickens, name)
  for chicken in chickens
    if chicken[:name] == name
      return chicken
    end
  end
  return nil
end

result1 = find_chicken_by_name(chicken_hashes,"Hetty")
result2 = find_chicken_by_name(chicken_hashes,"Audrey")
result3 = find_chicken_by_name(chicken_hashes,"Kim")

p result1
p result2
p result3
