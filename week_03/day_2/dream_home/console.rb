require('pry')
require_relative('models/property.rb')

Property.delete_all()

property1 = Property.new({'address' => '1 Main St', 'value' =>'95000', 'no_bedrooms' => '2', 'build' => 'Terraced'})
property1.save()
property2 = Property.new({'address' => '9 Station Rd', 'value' => '110000', 'no_bedrooms' => '3', 'build' => 'Detached'})
property2.save()
property3 = Property.new({'address' => '31 Union St', 'value' => '80000', 'no_bedrooms' => '1', 'build' => 'Flat'})
property3.save()

# property1.delete()

property2.value = '105000'
property2.update()

properties = Property.all()

found_property = Property.find_by_id(property2.id)

property_by_address = Property.find_by_address("31 Union St")

binding.pry
nil
