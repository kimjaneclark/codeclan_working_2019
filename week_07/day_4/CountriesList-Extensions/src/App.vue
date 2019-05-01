<template lang="html">
  <div>
    <h1>Countries</h1>
    <div class="main-container">
      <countries-list :countries = "countries"></countries-list>
      <country-details :country = "selectedCountry"></country-details>

    </div>
  </div>
</template>

<script>

import CountriesList from './components/CountriesList.vue';
import CountryDetails from './components/CountryDetails.vue';
import {eventBus} from './main.js';



export default {
  data(){
    return {
      countries: [],
      selectedCountry: null
    };
  },

  mounted(){
    fetch('https://restcountries.eu/rest/v2/all')
    .then(res => res.json())
    .then(countries => this.countries = countries)

    eventBus.$on("country-selected", (country) => {
      this.selectedCountry = country;
  });
},
  components: {
    "countries-list": CountriesList,
    "country-details": CountryDetails
  }
}
</script>

<style lang="css" scoped>
  .main-container {
    display: flex;
    justify-content: space-between;
  }
</style>
