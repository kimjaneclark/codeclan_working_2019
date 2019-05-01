import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: '#app',
    data: { greeting: "Hello World!",
    name: "Kimberley",
    age: 41
  },
  methods:{
    updateGreeting: function(){
      this.greeting = "Hello everyone"
    },
    updateAge: function(){
      this.age +=1;
    }
  }

  });
})
