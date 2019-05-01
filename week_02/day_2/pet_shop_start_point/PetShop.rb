class PetShop

  attr_reader :name, :cash

    def initialize(name, cash)
      @name = name
      @cash = cash
      @pets = []
    end

    def count_pets
      return @pets.length()
    end

    def add_pet(new_pet)
      @pets << new_pet
    end

    def calculate_inventory_value()
      total_value = 0
      for pet in @pets
        total_value += pet.price
      end
      return total_value
      end

  def sell_pet(name)
    #loop through checking each pet's name
    for pet in @pets
      if pet.name == name
    #increase shop cash
      @cash += pet.price
    #remove pet from @PetShop
      @pets.delete(pet)
      return pet
      end
    end
  end

end
