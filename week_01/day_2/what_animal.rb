p "What animal are you?"

type_of_animal = gets.chomp.downcase

if (type_of_animal == "chicken")
  p "That is my favourite animal"
elsif (type_of_animal == "tiger")
  p "Tigers are fierce"
else
  p "Not my favourite ;-("
end
