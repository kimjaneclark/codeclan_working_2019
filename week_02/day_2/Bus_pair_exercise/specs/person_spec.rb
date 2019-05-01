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

end
