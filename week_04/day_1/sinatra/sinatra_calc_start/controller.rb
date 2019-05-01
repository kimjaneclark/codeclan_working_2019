require('sinatra')
require('sinatra/contrib/all')
require('pry')

require_relative('./models/calculator')
also_reload('./models/*')

get '/' do
  erb(:home)
end

get '/about' do
  erb(:about)
end


get '/add/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.add()
  erb(:result)
end

get '/subtract/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.subtract()
  erb(:result)
end

get '/multiply/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.multiply()
  erb(:result)
end

get '/divide/:num1/:num2' do
  if params[:num2].to_i != 0
    calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
    @calculation = calculator.divide()
    erb(:result)
  end


end
