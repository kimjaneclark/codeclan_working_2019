<template lang="html">
  <li>{{character.name}}</li>
</template>

<script>
export default {
  name: 'list-item',
  props: ['character']
}
</script>

<style lang="css" scoped>
</style>
