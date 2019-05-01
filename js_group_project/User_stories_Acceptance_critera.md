Users:
Kids 5-8 years target
Teachers
Admin

MVP

As a user...
I want to be able to view a grid of items things I on a topic I am interested in
so I can learn

As a user...
I want to be able to get more information when I click on it an item I am interested in
so I can learn more

As a user...
I want to confirm my understanding of the topic via a test


Extension
As a users..
I want to find out about other topics so I can continue my learning


db.sharks.insertMany([
  {
    category: "shark",
    species: "Great White",
    diet: "Prey upon fish (e.g. tuna, rays, other sharks), cetaceans (i.e., dolphins, porpoises, whales), pinnipeds (e.g. seals, fur seals, and sea lions), sea turtles, sea otters and seabirds.",
    size: "Female: 4.5 – 6.4 m (Adult), Male: 3.5 – 4 m (Adult)",
    picture: "src/assets/shark_pictures/Great_white_shark.jpg",
    habitat: "Great white sharks live in coastal and offshore water of between 12 to 24 degrees",
    fact: "The great white is at the top of the food chain and has few threats in the ocean.",
    markers:[[-35.327345,136.1008431],[-34.5848764,19.3348983],[29.0185055,-118.4330882],[-46.986053,167.558006],[26.004858,-81.5987127]]
  },
  {
    category: "shark",
    species: "Great Hammerhead",
    diet: "Fish (including other sharks), squid, octopus, and crustaceans. Stingrays are their favorite.",
    size: "6m",
    picture: "src/assets/shark_pictures/great_hammerhead.jpg",
    habitat: "In tropical and warm waters worldwide, inhabiting coastal areas.",
    fact: "The Great Hammerhead weighs about the same as a piano.",
    markers:[[0.1304846,-89.7100369],[1.8107632,103.4455052],[-30.8333392,30.3432544],[4.0061324,-81.6023659], [-16.1042863,176.0365091]]
  },
  {
    category: "shark",
    species: "Tiger",
    diet: "The Tiger shark has the widest diet of any sharks. This includes crustaceans, fish, seals, birds, squid, turtles, sea snakes, dolphins and sometimes smaller sharks",
    size: "5m",
    picture: "src/assets/shark_pictures/tiger_shark.jpg",
    habitat: "Tiger sharks found in tropical and warm water seas.",
    fact: "Tiger sharks are named that way because of their tiger-like, black stripes that cover the body of young animals",
    markers:[[-18.390889,178.0942539],[26.004858,-81.5987127],[19.4848622,-99.1200503],[26.004858,-81.5987127]]
  },
  {
    category: "shark",
    species: "Whale",
    diet: "The Whale Shark is filter feeder. They only on plankton and small fishes",
    size: "10m",
    picture: "src/assets/shark_pictures/whale_shark.jpg",
    habitat: "The whale shark inhabits all tropical and warm-temperate seas.",
    fact: " Whale sharks have about 3,000 tiny teeth but they don't use those teeth to eat.",
    markers:[[12.9627144,123.4803871],[22.8959998,-109.9698899],[3.4986904,72.8939863],[7.81793,39.6089631],[26.859057,110.2513777]]
  },
  {
    category: "shark",
    species: "Bull",
    diet: "The Bull shark eats bony fish and small sharks and stingrays. ",
    size: "3.5m",
    picture: "src/assets/shark_pictures/bull_shark.jpg",
    habitat: "The bull shark is commonly found worldwide in coastal areas of warm oceans, in rivers and lakes.",
    fact: "Bull sharks have the strongest bite of all the sharks",
    markers:[[19.4848622,-99.1200503,17],[11.5759659,-85.9167196]]
  },
  {
    category: "shark",
    species: "Blue",
    diet: "Blue Sharks feed on small fish and squid",
    size: "3m",
    picture: "src/assets/shark_pictures/blue_shark.jpg",
    habitat: "The blue shark is found worldwide in deep temperate and tropical water",
    fact: "Blue sharks live in groups called Schools",
    markers:[[-18.390889,178.0942539],[26.004858,-81.5987127],[19.4848622,-99.1200503],[26.004858,-81.5987127]]
    }
]);
