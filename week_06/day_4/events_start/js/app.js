document.addEventListener('DOMContentLoaded', () => {
  const button = document.querySelector('#button') //get hold of addEventListener
  button.addEventListener('click', handleButtonClick)

  const textInput = document.querySelector('#input')
  textInput.addEventListener('input', handleInput)


  const select = document.querySelector('#select')
  select.addEventListener('change', handleSelect)

  const form = document.querySelector('#form')
  form.addEventListener('submit', handleFormSubmit)
});


const handleButtonClick = function(){
  const resultText = document.querySelector('#button-result')
  resultText.textContent = "That button has been clicked";
}

  const handleInput = function(event){
    const resultInput = document.querySelector('#input-result')
    resultInput.textContent = `You have typed ${event.target.value}`
  }

  const handleSelect = function(event){
    const selectResult = document.querySelector('#select-result')
    selectResult.textContent = `You have selected ${event.target.value}`
  }

  const handleFormSubmit = function(event){
    event.preventDefault()


    const formResult = document.querySelector('#form-result')
    formResult.textContent = `
    Your Name:
    ${this.first_name.value}
    ${event.target.last_name.value}`
  }
