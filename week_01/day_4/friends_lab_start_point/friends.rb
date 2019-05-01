require 'pry'

def get_name(person)
  return person[:name]
end

def get_favourite_tv(person)
  return person[:favourites][:tv_show]
end

def likes_to_eat(person, food)
  if food != "Scooby snacks"
  #if food != [:favourites][:snacks]
    return false
  elsif food = "Scooby snacks"
  #elseif food = [:favourites][:snacks]
    return true
  end
end

def add_friend(friend, new_friend)
  friend[:friends].push(new_friend)
end

def remove_friend(friend, old_friend)
  friend[:friends].delete(old_friend)
end

def total_money(people)
  total_monies = 0
  for person in people
  total_monies += person[:monies]
end
return total_monies
end

def money_lending(lender, lendee, amount)
  lender[:monies] -= amount
  lendee[:monies] += amount
end


def all_foods(people)
  result = []
  for person in people
    result += person[:favourites][:snacks]
  end
  return result
end


def no_friends(people)
  no_friends = []
  for person in people
    if person[:friends].empty?
      no_friends.push(person)
    end
  end
return no_friends
end



#lender monies - amount lendee monies +amount
# total_eggs = 0
#
# for chicken in chickens
#   total_eggs += chicken[:eggs]
#   chicken[:eggs] = 0
# end
