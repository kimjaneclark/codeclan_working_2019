# Ask the question
# Recieve input
# Check input
# If correct respond
#otherwise respond negatively

p "What year do you think Ruby was created?"

ruby_creation = gets.chomp

if (ruby_creation == "1995")
  p "Correct, well done!"
else
  p "Nae Luck"
end
