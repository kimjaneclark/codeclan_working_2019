require("minitest/autorun")
require("minitest/rg")
require_relative("../my_functions")

class FunctionsTest < MiniTest::Test
  def test_greet
    result = greet("John","morning")
    assert_equal("Good morning, John", result)
  end

  def test_greet__afternoon
    result = greet("Colin","afternoon")
    assert_equal("Good afternoon, Colin", result)
  end

def test_add_negative
  result = add(10, -2)
  assert_equal(8, result)
end

def test_add_positive
  result = add(3, 2)
  assert_equal(5, result)
end

end
