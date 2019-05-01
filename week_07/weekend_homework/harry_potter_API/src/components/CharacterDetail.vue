<template lang="html">
<div v-if ="character">

  <h1>{{character.name}}</h1>
  <p>House: {{character.house}}</p>
  <p>Ancestry {{character.ancestry}}</p>
</div>


</template>

<script>
export default {
  name: 'character-detail',
  props: ["character"]
}
</script>

<style lang="css" scoped>
</style>
