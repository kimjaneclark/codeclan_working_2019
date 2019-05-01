import React from 'react';
import CountrySelector from '../components/CountrySelector';
import CountryDetail from '../components/CountryDetail';

class CountryContainer extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      countries: [],
      selectedCountry: null
    };
    this.handleCountrySelected = this.handleCountrySelected.bind(this);
  }

  componentDidMount(){
    const url= 'https://restcountries.eu/rest/v2/all';
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({countries: data}))
  }

  handleCountrySelected(index){
    const selectedCountry = this.state.countries[index];
    this.setState({selectedCountry: selectedCountry})
  }

  render(){
    return (
      <div>
        <h2>Country Container</h2>
        <CountrySelector
          countries={this.state.countries}
          handleSelected={this.handleCountrySelected}
        />
        <CountryDetail country={this.state.selectedCountry}/>
      </div>
    );
  }
}

export default CountryContainer;
