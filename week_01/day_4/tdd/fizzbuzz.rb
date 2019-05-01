




def fizz_buzz(number)
  if(number % 3 == 0 && number % 5 == 0)
    return "FizzBuzz"
  elsif (number % 5 == 0)
    return "Buzz"
  elsif (number % 3 == 0)
    return "Fizz"
  else
    return number.to_s()
  end
end

# with case statement
# def fizz_buzz(num)
#
#   case
#   when num % 15 == 0 then "FizzBuzz"
#   when num % 3  == 0 then "Fizz"
#   when num % 5  == 0 then "Buzz"
#   else num.to_s()
#   end
#
# end
