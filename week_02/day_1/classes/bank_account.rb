class BankAccount

  attr_accessor :type, :balance, :holder_name
  # attr_reader :type, :balance, :holder_name
  # attr_writer :type, :balance, :holder_name

  def initialize(holder_name, balance, type)
    @holder_name = holder_name
    @balance = balance
    @type = type
  end

  def pay_in(amount)
    @balance += amount
  end

  def pay_monthly()
    @balance -= 10 if @type == 'personal'
    @balance -= 50 if @type == 'business'
    #if type == "personal"
    #@balance -= 10
    #elsif type == "business"
    #@balance -= 500
  end


  # def holder_name
  #   return @holder_name
  # end
  #
  # def get_balance
  #   return @balance
  # end
  #
  # def account_type
  #   return @type
  # end

  # def set_holder_name(new_name)
  #   @holder_name = new_name
  # end
  #
  # def set_balance(new_balance)
  #   @balance = new_balance
  # end
  #
  # def set_account_type(new_account_type)
  #   @type = new_account_type
  # end

end
