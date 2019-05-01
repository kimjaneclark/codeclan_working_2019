require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry' )

require_relative('./models/pizza_order')
also_reload("./models/*")

# index all pizza
get '/pizza-orders' do
  @orders = PizzaOrder.all()
  erb(:index)
end

# new form to order
get '/pizza-orders/new' do
  erb(:new)
end



# show for just 1 pizza
get '/pizza-orders/:id' do
  @order = PizzaOrder.find(params[:id])
  erb(:show)
end



# create

post '/pizza-orders' do
  @order = PizzaOrder.new(params)
  @order.save()
  erb(:create)
3end

# edit
get '/pizza-orders/:id/edit' do
  @order = PizzaOrder.find(params[:id])
  erb(:edit)
end

# update db
post '/pizza-orders/:id' do
  order = PizzaOrder.new(params)
  order.update
  redirect '/pizza-orders'
end

# delete
post '/pizza-orders/:id/delete' do
  @order = PizzaOrder.find(params[:id])
  @order.delete()
  redirect to '/pizza-orders'
end
