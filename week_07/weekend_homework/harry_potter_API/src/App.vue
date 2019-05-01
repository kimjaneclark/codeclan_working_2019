<template lang="html">
  <div>
    <h1>Harry Potter Characters</h1>
    <div class="main-container">

    </div>
  </div>
</template>


<script>
import CharactersList from './components/CharactersList.vue';
import CharacterDetail from './components/CharacterDetail.vue';
import {eventBus} from './main.js';

export default {
  name: 'app',
  data(){
    return {
      characters: [],
      selectedCharacter: null
    };
  },
  mounted(){
    fetch('http://hp-api.herokuapp.com/api/characters')
    .then(res => res.json())
    .then(characters => this.characters = characters)

    eventBus.$on("character-selected", (character) => {
      this.selectedCharacter = character;

    });
  },
  components: {
    "characters-list": CharactersList,
    "character-detail": CharacterDetail
  }
}


</script>

<style lang="css" scoped>
  .main-container {
    display: flex;
    justify-content: space-between;
  }
</style>
