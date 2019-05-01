require('pg')
class Property

  attr_accessor :address, :value, :no_bedrooms, :build
  attr_reader :id

  def initialize(options)
    @address = options['address']
    @value = options['value'].to_i
    @no_bedrooms = options['no_bedrooms'].to_i
    @build = options['build']
    @id = options['id'].to_i if options['id']
  end

  def save
    db = PG.connect({dbname: 'property', host: 'localhost'})
    sql =
    "INSERT INTO properties(address,
    value,
    no_bedrooms,
    build)
    VALUES ($1, $2, $3, $4)
    RETURNING *"
    values =[@address, @value, @no_bedrooms, @build]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]['id'].to_i
    db.close()
  end

  def Property.all() #class method
    db = PG.connect({dbname: 'property', host: 'localhost'})
    sql = "SELECT * FROM properties"
    db.prepare("all", sql)
    values = db.exec_prepared("all")
    results = values.map { |value| Property.new(value)}
    db.close()
    return results
  end

  def delete()
    db = PG.connect({dbname: 'property', host: 'localhost'})
    sql = "DELETE FROM properties WHERE id = $1"
    values =[@id]
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close()
  end

 def update()
   db = PG.connect({dbname: 'property', host: 'localhost'})
   sql = "UPDATE properties SET ( address, value, no_bedrooms, build) = ($1, $2, $3, $4) WHERE id = $5"
   values = [@address, @value, @no_bedrooms, @build, @id]
   db.prepare("update", sql)
   db.exec_prepared("update", values)
   db.close()
 end

 def Property.delete_all()
       db = PG.connect({dbname: 'property', host: 'localhost'})
       sql = "DELETE FROM properties"
       db.prepare("delete_all", sql)
       db.exec_prepared("delete_all")
       db.close()
     end

 def Property.find_by_id(id)
   db = PG.connect({dbname: 'property', host: 'localhost'})
   sql = "SELECT * FROM properties WHERE id = $1"
   values = [id]
   db.prepare("find", sql)
   results_array = db.exec_prepared("find", values)
   db.close()
   property_hash = results_array[0]
   return Property.new(property_hash)
 end


# def Propert.find_by_address
# end

def Property.find_by_address(address)
    db = PG.connect({dbname: 'property', host: 'localhost'})
    sql = "SELECT * from properties WHERE address = $1"
    values = [address]
    db.prepare("find_by_address", sql)
    results_array = db.exec_prepared("find_by_address", values)
    db.close()
    return nil if results_array.count == 0
    property_hash = results_array[0]
    found_property = Property.new(property_hash)
    return found_property
  end

end
