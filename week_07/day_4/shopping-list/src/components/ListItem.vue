<template lang="html">
  <div class="">


  <p :class="{'purchased': item.purchased}">{{item.name}}</p>
  <button v-if="!item.purchased" type="button" name="button" v-on:click ="purchase">Purchase</button>
</div>
</template>

<script>
export default {
  name: "list-item",
  props: ["item"],
  methods: {
    purchase(){
      this.item.purchased = true
    }
  }
}
</script>

<style lang="css" scoped>
p {
  background-color: lightgoldenrodyellow;
}

.purchased{
  text-decoration: line-through;
  background-color: red;
}
</style>
