<template lang="html">
<div v-if ="munro">

  <h1>{{munro.name}}</h1>
  <p>Height: {{munro.height}}</p>
  <p>Meaning: {{munro.meaning}}</p>
  <p>Region: {{munro.region}}</p>
</div>


</template>

<script>
export default {
  name: 'munro-detail',
  props: ["munro"]
}
</script>

<style lang="css" scoped>
</style>
