require('minitest/autorun')
require('minitest/rg')
require_relative('../bank_account.rb')

class TestBankAccount < MiniTest::Test

  def test_account_name
    account = BankAccount.new("Kim", 1000, "personal")
    assert_equal("Kim", account.holder_name)
  end

  def test_blance
    account = BankAccount.new("Ken", 500, "business")
    assert_equal(500, account.balance)
  end

  def test_account_type
    account = BankAccount.new("Abi", 100, "kids")
    assert_equal("kids", account.type)
  end

  def test_set_account_name
    account = BankAccount.new("Kim", 1000, "personal")
    account.holder_name = "Finlay"
    assert_equal("Finlay", account.holder_name)
  end

  def test_set_balance
    account = BankAccount.new("Abi", 100, "kids")
    account.balance = 150
    assert_equal(150, account.balance)
  end

  def test_set_account_type
    account = BankAccount.new("Abi", 100, "kids")
    account.type = "youth"
    assert_equal("youth", account.type)
  end

  def test_pay_into_account
    account = BankAccount.new("Ken", 500, "business")
    account.pay_in(1000)
    assert_equal(1500, account.balance)
  end

  def test_pay_monthly_fee_business
    account = BankAccount.new("Kim", 1000, "business")
    account.pay_monthly()
    assert_equal(950, account.balance)
  end

  def test_pay_monthly_fee_personal
    account = BankAccount.new("Fraser", 500, "personal")
    account.pay_monthly()
    assert_equal(490, account.balance)
  end



end
