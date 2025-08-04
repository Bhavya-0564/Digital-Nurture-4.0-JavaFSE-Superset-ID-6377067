import React, { useState } from 'react';
import CurrencyConverter from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(prev => prev + 1);
    alert("Hello Member1");
  };

  const handleDecrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>React App</h2>
      <p>Count: {count}</p>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
      <button onClick={handleClick}>Click on me</button>
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
