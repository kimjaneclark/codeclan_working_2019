document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');


  //find the form add eventListner onto

  const form = document.querySelector('#new-item-form')
    form.addEventListener('submit', handleFormSubmit)

    const deleteAllButton = document.querySelector()

})


const handleFormSubmit = function(event){
  event.preventDefault()
  const listElement = document.createElement('li')

  const title = document.createElement('p')
  title.textContent = this.title.value
  listElement.appendChild(title)

  const author = document.createElement('p')
  author.textContent = this.author.value
  listElement.appendChild(author)

  const category = document.createElement('p')
  category.textContent = this.category.value
  listElement.appendChild(category)

  const readingList = document.querySelector('#reading-list')
  readingList.appendChild(listElement)

  this.reset()

}

//find the form add eventListner onto

// const form = document.querySelector('#new-item-form')
//   form.addEventListener('submit', handleFormSubmit)

//
// //handle form submit - create li
//
//
// //to li append 3 children p tags - results from form
// //Append created li onto the reading list
//
// const newListItem = document.createElement('li'); // NEW
// newListItem.textContent = 'Purple'; // NEW
// newListItem.classList.add('purple'); // NEW
//
// const list = document.querySelector('ul'); // NEW
// list.appendChild(newListItem); // NEW
//
//
// const handleFormSubmit = function(event){
//     event.preventDefault()
//     const formResult = document.querySelector('#reading_list')
//     formResult. = `
//     Your Name:
//     ${this.first_name.value}
//     ${event.target.last_name.value}`
//   }
