<template lang="html">
  <div class="game-wrapper">
    <Game
      v-for="(game, index) in games"
      v-bind:key="index"
      v-bind:game="game" />
  </div>
</template>

<script>
import { eventBus } from '../main.js'
import Game from './Game.vue'
export default {
	data(){
		return {
			games: []
		};
	},
	mounted(){
		fetch("http://localhost:3000/api/games")
			.then(res => res.json())
			.then(games => this.games = games);

      eventBus.$on('game-added', (game) => {
        this.games.push(game)
      })

      eventBus.$on('game-deleted', (id) => {
        let index = this.games.findIndex(game => game._id === id)
         this.games.splice(index, 1)
      })
	},
	components: {
    Game
	}
}
</script>

<style lang="css" scoped>

.game-wrapper {
  display: flex;
  flex-wrap: wrap;
}
</style>
