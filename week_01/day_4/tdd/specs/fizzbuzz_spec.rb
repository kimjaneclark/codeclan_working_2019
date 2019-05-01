require("minitest/autorun")
require("minitest/rg")
require_relative("../fizzbuzz.rb")

class TestFizzBuzz < MiniTest::Test
  def test_fizz_buzz_3_returns_fizz
    expected = "Fizz"
    actual = fizz_buzz(3)
    assert_equal(expected, actual)
  end

  def test_fizz_buzz_5_returns_fizz
    expected = "Buzz"
    actual = fizz_buzz(5)
    assert_equal(expected, actual)
  end

  def test_fizz_buzz_15test_fizz_buzz_3_returns_fizz
    expected = "FizzBuzz"
    actual = fizz_buzz(15)
    assert_equal(expected, actual)
  end

  def test_return_other_numbers_to_string
    expected = "2"
    actual = fizz_buzz(2)
    assert_equal(expected, actual)
  end


end
