require("minitest/autorun")
require("minitest/rg")

require_relative("../Bus")
require_relative("../Person")
require_relative("../BusStop")

class TestPerson < MiniTest::Test

def setup
  @person1 = Person.new("Collin", 30)
  @person2 = Person.new("Kim", 41)
end

def test_add_person_to_queue
  @queue.add_to_queue(@person1)
  assert_equal("Collin", @person1.name)
end

end
