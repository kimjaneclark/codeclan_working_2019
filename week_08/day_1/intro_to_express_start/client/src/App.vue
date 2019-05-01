<template>
  <div id="app">
    <h1>My App</h1>
    <p v-if = "serverMessage"> {{serverMessage}} </p>
  </div>
</template>

<script>
export default {
  name: 'app',
  mounted(){
    fetch("http://localhost:3000/")
    .then(response => response.json())
    .then(json => this.serverMessage = json.message);
  },
  data () {
    return {
      serverMessage: ""

    }
  }
}
</script>

<style>

</style>
