# avengers = {
#   Ironman: {name:"Tony Stark",
#             punch: 10,
#             kick: 100},
#   Hulk: {name:"Bruce Banner",
#           smash: 1000,
#           roll: 500}
# }
# p avengers [:Ironman][:kick]

avengers = {
  Ironman: {name:"Tony Stark",
            moves:
            {punch: 10,
            kick: 100
          }
          },
  Hulk: {name:"Bruce Banner",
          moves:
          {smash: 1000,
          roll: 500
        }
        }
}
p avengers [:Hulk][:name]
