require 'sinatra'
require 'sinatra/contrib/all' if development?

get '/hi' do
  "Hello world!"
end

get '/roll-die' do
  rand(1..6).to_s
end


get '/name/:first/:last' do #colons are used as placeholders
  return "Your name is #{params[:first]} #{params[:last]}"
end

get '/friends/:number' do
  best_friends = ["Lorna", "Anne", "Ken"]
  index = params["number"].to_i - 1
  return best_friends[index]
end


get '/square/:num' do
  num = params[:num].to_i
  return "Number squared = #{ num * num}"
end


get '/pet/:hello' do
  "hello pet"
end

#will never work as hits the above first
get '/pet/:name' do
  "Hello #{params[:name]}"
end
