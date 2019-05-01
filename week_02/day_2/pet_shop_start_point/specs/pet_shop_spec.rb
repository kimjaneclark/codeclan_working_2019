require("minitest/autorun")
require("minitest/rg")

require_relative("../Pet")
require_relative("../PetShop")

class TestPetShop < MiniTest::Test
  def setup
    @pet1 = Pet.new("Sir Percy", :cat, "British Shorthair", 500)
    @pet2 = Pet.new("Mr Wiggles", :cat, "British Shorthair", 750)

    @pet_shop = PetShop.new("Camelot of Pets", 1000)
  end

  def test_petshop_has_name
    assert_equal("Camelot of Pets", @pet_shop.name)
  end

  def test_petshop_cash
    assert_equal(1000, @pet_shop.cash)
  end

  def test_petshop_starts_with_no_pets
    assert_equal(0, @pet_shop.count_pets())
  end

  def test_petshop_can_add_pet
    @pet_shop.add_pet(@pet1)
    assert_equal(1, @pet_shop.count_pets())
  end

  def test_petshop_can_get_inventory_value
    @pet_shop.add_pet(@pet1)
    @pet_shop.add_pet(@pet2)
    assert_equal(1250, @pet_shop.calculate_inventory_value())
  end

  def test_petshop_can_sell_pet
    @pet_shop.add_pet(@pet1)
    @pet_shop.add_pet(@pet2)
    returned_pet = @pet_shop.sell_pet("Sir Percy")
    assert_equal(1, @pet_shop.count_pets())
    assert_equal(1500, @pet_shop.cash)
    assert_equal(@pet1,returned_pet)
  end
end
