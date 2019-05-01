document.addEventListener("DOMContentLoaded", () => {
  const newListItem = document.createElement('li');
  newListItem.textContent = 'purple';
  newListItem.classList.add('purple');
  const list = document.querySelector('ul');

  // debugger;

  list.appendChild(newListItem);
  console.log(list);

}
  // const redListItem = document.querySelector('li.red');
  // redListItem.classList.add('bold');
  // redListItem.classList.remove('red');




  // const listElements = document.querySelectorAll('li');
  // listElements.forEach(element => console.log(element));

  // const title = document.querySelector('h1');
  // title.textContent = "Updated!";

  // const welcome = document.querySelector('#welcome-paragraph');
  // console.log(welcome);

  // const redElements = document.querySelector('.red)');
  // console.log(redElements);
 );
