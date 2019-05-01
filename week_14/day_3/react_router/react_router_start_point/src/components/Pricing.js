import React from "react";

const Pricing = ({prices}) => {

  const listItems = prices.map((price, index) => {
    return <li key={index}>{price.level}: £{price.cost}</li>
  })

  return
  <div>
  <ul>
    {listItems}
  </ul>

  </div>

}

export default Pricing;
